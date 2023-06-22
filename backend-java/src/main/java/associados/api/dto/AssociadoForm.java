package associados.api.dto;

import associados.api.model.Categoria;

import java.time.LocalDate;

public record AssociadoForm(
        Long id,
        String nome,
        String observacao,
        Categoria categoria,
        LocalDate dataNascimento,
        String naturalidade,
        String estadoNatural,
        String estadoCivil,
        String nacionalidade,
        String endereco,
        String bairro,
        String cidade,
        String estado,
        String telefone,
        int mesPago,
        int anoPago
) {
}
