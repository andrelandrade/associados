package associados.api.dto;

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
}
