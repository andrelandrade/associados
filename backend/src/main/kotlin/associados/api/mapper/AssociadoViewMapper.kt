package associados.api.mapper

import associados.api.dto.AssociadoView
import associados.api.model.Associado
import org.springframework.stereotype.Component

@Component
class AssociadoViewMapper: Mapper<Associado, AssociadoView> {
    override fun map(t: Associado): AssociadoView {
        return AssociadoView(
            id = t.id,
            nome = t.nome
        )
    }
}
