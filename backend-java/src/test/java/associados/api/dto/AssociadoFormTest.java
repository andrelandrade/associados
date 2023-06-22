package associados.api.dto;

import associados.api.model.Categoria;

import java.time.LocalDate;

public class AssociadoFormTest {
    public static AssociadoForm build() {
        var pagoAte = LocalDate.now().plusMonths(3);

        return new AssociadoForm(
                1L,
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
                pagoAte.getYear()
        );
    }
}
