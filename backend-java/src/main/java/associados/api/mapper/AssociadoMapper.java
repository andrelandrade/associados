package associados.api.mapper;

import associados.api.dto.AssociadoForm;
import associados.api.model.Associado;
import org.springframework.stereotype.Component;

@Component
public class AssociadoMapper implements Mapper<Associado, AssociadoForm> {

    @Override
    public AssociadoForm map(Associado associado) {
        return new AssociadoForm(
                associado.getId(),
                associado.getNome(),
                associado.getObservacao(),
                associado.getCategoria(),
                associado.getDataNascimento(),
                associado.getNaturalidade(),
                associado.getEstadoNatural(),
                associado.getEstadoCivil(),
                associado.getNacionalidade(),
                associado.getEndereco(),
                associado.getBairro(),
                associado.getCidade(),
                associado.getEstado(),
                associado.getTelefone(),
                associado.getMesPago(),
                associado.getAnoPago()
        );
    }
}
