package associados.api.service

import associados.api.dto.AssociadoForm
import associados.api.mapper.AssociadoFormMapper
import associados.api.repository.AssociadoRepository
import org.springframework.stereotype.Service

@Service
class AssociadoService(
    private val repository: AssociadoRepository,
    private val associadoFormMapper: AssociadoFormMapper
) {

    fun cadastrar(form: AssociadoForm) {
        val associado = associadoFormMapper.map(form)

        repository.save(associado)
    }
}
