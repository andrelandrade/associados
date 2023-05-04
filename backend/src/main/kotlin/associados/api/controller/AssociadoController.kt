package associados.api.controller

import associados.api.dto.AssociadoForm
import associados.api.service.AssociadoService
import jakarta.transaction.Transactional
import org.springframework.web.bind.annotation.PostMapping
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
}