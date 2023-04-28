package associados.api.controller

import associados.api.dto.AssociadoForm
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("associados")
class AssociadoController {

    @PostMapping
    fun cadastrar(@RequestBody form: AssociadoForm) {
        println(form)
    }
}