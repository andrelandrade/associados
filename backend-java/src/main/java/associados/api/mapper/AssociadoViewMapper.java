package associados.api.mapper;

import associados.api.dto.AssociadoView;
import associados.api.model.Associado;
import org.springframework.stereotype.Component;

@Component
public class AssociadoViewMapper implements Mapper <Associado, AssociadoView> {
    @Override
    public AssociadoView map(Associado associado) {
        return new AssociadoView(
                associado.getId(),
                associado.getNome(),
                associado.getEndereco(),
                associado.getBairro(),
                associado.getCidade(),
                associado.getEstado(),
                associado.getMesPago(),
                associado.getAnoPago()
        );
    }
}
