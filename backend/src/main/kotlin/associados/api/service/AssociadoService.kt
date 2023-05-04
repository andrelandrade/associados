package associados.api.service

import associados.api.dto.AssociadoForm
import associados.api.dto.AssociadoView
import associados.api.mapper.AssociadoFormMapper
import associados.api.mapper.AssociadoMapper
import associados.api.mapper.AssociadoViewMapper
import associados.api.repository.AssociadoRepository
import org.springframework.data.crossstore.ChangeSetPersister.NotFoundException
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service

@Service
class AssociadoService(
    private val repository: AssociadoRepository,
    private val associadoMapper: AssociadoMapper,
    private val associadoViewMapper: AssociadoViewMapper,
    private val associadoFormMapper: AssociadoFormMapper
) {

    fun cadastrar(form: AssociadoForm) {
        val associado = associadoMapper.map(form)

        repository.save(associado)
    }

    fun listar(paginacao: Pageable): Page<AssociadoView> {
        val associados = repository.findAll(paginacao)

        return associados.map { t ->
            associadoViewMapper.map(t)
        }
    }

    fun buscarPorId(id: Long): AssociadoForm {
        val associado = repository.findByIdOrNull(id) ?: throw NotFoundException()

        return associadoFormMapper.map(associado)
    }
}
