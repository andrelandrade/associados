package associados.api.model;

import associados.api.dto.CadastroAssociadoDTO;

public class AssociadoTest {
    public static Associado build(CadastroAssociadoDTO cadastroAssociadoDTO) {
        var associado = new Associado(cadastroAssociadoDTO);
        associado.setId(1L);

        return associado;
    }
}
