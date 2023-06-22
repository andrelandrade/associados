package associados.api.model;

import associados.api.dto.AssociadoForm;
import associados.api.mapper.AssociadoFormMapper;

public class AssociadoTest {
    public static Associado build(AssociadoForm associadoForm) {
        var associado = new AssociadoFormMapper().map(associadoForm);
        associado.setId(1L);

        return associado;
    }
}
