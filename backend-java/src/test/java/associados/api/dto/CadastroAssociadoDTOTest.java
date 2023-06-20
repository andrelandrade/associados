package associados.api.dto;

import associados.api.model.Categoria;

import java.time.LocalDate;

public class CadastroAssociadoDTOTest {
    public static CadastroAssociadoDTO build() {
        var pagoAte = LocalDate.now().plusMonths(3);

        return new CadastroAssociadoDTO(
                "nome",
                "rock star",
                Categoria.APOSENTADO,
                LocalDate.of(1949,8,25),
                "naturalidade",
                "SP",
                "C",
                "nacionalidade",
                "endereco",
                "bairro",
                "cidade",
                "estado",
                "telefone",
                pagoAte.getMonthValue(),
                pagoAte.getYear(),
                1L
        );
    }
}
