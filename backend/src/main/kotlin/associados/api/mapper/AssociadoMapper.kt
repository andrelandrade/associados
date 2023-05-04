package associados.api.mapper

import associados.api.dto.AssociadoForm
import associados.api.model.Associado
import org.springframework.stereotype.Component

@Component
class AssociadoMapper: Mapper<AssociadoForm, Associado> {
    override fun map(t: AssociadoForm): Associado {
        return Associado(
            nome = t.nome,
            observacao = t.observacao,
            categoria = t.categoria,
            dataNascimento = t.dataNascimento,
            naturalidade = t.naturalidade,
            estadoNatural = t.estadoNatural,
            nacionalidade = t.nacionalidade,
            endereco = t.endereco,
            bairro = t.bairro,
            estado = t.estado,
            telefone = t.telefone,
            mesPago = t.mesPago,
            anoPago = t.anoPago,
            cidade = t.cidade,
            estadoCivil = t.estadoCivil
        )
    }
}