package associados.api.model;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Table(name = "associados")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Associado {
    private String nome;
    private String observacao;
    @Enumerated(EnumType.STRING)
    private Categoria categoria;
    private LocalDate dataNascimento;
    private String naturalidade;
    private String estadoNatural;
    private String estadoCivil;
    private String nacionalidade;
    private String endereco;
    private String bairro;
    private String cidade;
    private String estado;
    private String telefone;
    private int mesPago;
    private int anoPago;
    @Setter(AccessLevel.NONE)
    private LocalDate dataCadastro = LocalDate.now();
    private boolean ativo = true;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
