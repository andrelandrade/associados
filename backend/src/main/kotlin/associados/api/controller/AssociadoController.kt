package associados.api.controller

import associados.api.dto.AssociadoForm
import associados.api.dto.AssociadoView
import associados.api.service.AssociadoService
import jakarta.transaction.Transactional
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.domain.Sort
import org.springframework.data.web.PageableDefault
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.PutMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("associados")
class AssociadoController(private val service: AssociadoService) {

    @PostMapping
    @Transactional
    fun cadastrar(@RequestBody form: AssociadoForm) {
        service.cadastrar(form)
    }

    @GetMapping
    fun listar(
        @PageableDefault(size = 10, sort = ["nome"], direction = Sort.Direction.ASC)
        pageable: Pageable
    ) : Page<AssociadoView> {
        return service.listar(pageable)
    }

    @GetMapping("/{id}")
    fun buscarPorId(@PathVariable id: Long): AssociadoForm {
        return service.buscarPorId(id)
    }

    @PutMapping("/{id}")
    @Transactional
    fun atualizar(@PathVariable id: Long,
                  @RequestBody form: AssociadoForm) {
        return service.atualizar(id, form)
    }

    @DeleteMapping("/{id}")
    @Transactional
    fun excluir(@PathVariable id: Long) {
        return service.excluir(id)
    }
}