package associados.api.mapper

import associados.api.dto.AssociadoForm
import associados.api.model.Associado
import org.springframework.stereotype.Component

@Component
class AssociadoFormMapper: Mapper<Associado, AssociadoForm> {
    override fun map(t: Associado): AssociadoForm {
        return AssociadoForm(
            t.nome,
            t.observacao,
            t.categoria,
            t.dataNascimento,
            t.naturalidade,
            t.estadoNatural,
            t.nacionalidade,
            t.estadoCivil,
            t.endereco,
            t.bairro,
            t.cidade,
            t.estado,
            t.telefone,
            t.mesPago,
            t.anoPago
        )
    }
}