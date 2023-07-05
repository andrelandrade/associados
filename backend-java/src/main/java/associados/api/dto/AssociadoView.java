package associados.api.dto;

import associados.api.model.Associado;

public record AssociadoView(
        Long id,
        String nome,
        String endereco,
        String bairro,
        String cidade,
        String estado,
        int mespago,
        int anopago
) {

    public AssociadoView(Associado associado) {
        this(associado.getId(), associado.getNome(), associado.getEndereco(), associado.getBairro(),
                associado.getCidade(), associado.getEstado(), associado.getMesPago(), associado.getAnoPago());
    }
}
