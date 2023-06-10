package associados.api.dto;

import associados.api.model.Categoria;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;

import java.time.LocalDate;

public record CadastroAssociadoDTO(
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
