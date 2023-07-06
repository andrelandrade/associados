package associados.api.model;

import associados.api.dto.AssociadoForm;
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

    public void atualiza(AssociadoForm associadoDTO) {
        this.nome = associadoDTO.nome() != null ? associadoDTO.nome() : this.nome;
        this.observacao = associadoDTO.observacao() != null ? associadoDTO.observacao() : this.observacao;
        this.categoria = associadoDTO.categoria() != null ? associadoDTO.categoria() : this.categoria;
        this.dataNascimento = associadoDTO.dataNascimento() != null ? associadoDTO.dataNascimento() : this.dataNascimento;
        this.naturalidade = associadoDTO.naturalidade() != null ? associadoDTO.naturalidade() : this.naturalidade;
        this.estadoNatural = associadoDTO.estadoNatural() != null ? associadoDTO.estadoNatural() : this.estadoNatural;
        this.estadoCivil = associadoDTO.estadoCivil() != null ? associadoDTO.estadoCivil() : this.estadoCivil;
        this.nacionalidade = associadoDTO.nacionalidade() != null ? associadoDTO.nacionalidade() : this.nacionalidade;
        this.endereco = associadoDTO.endereco() != null ? associadoDTO.endereco() : this.endereco;
        this.bairro = associadoDTO.bairro() != null ? associadoDTO.bairro() : this.bairro;
        this.cidade = associadoDTO.cidade() != null ? associadoDTO.cidade() : this.cidade;
        this.estado = associadoDTO.estado() != null ? associadoDTO.estado() : this.estado;
        this.telefone = associadoDTO.telefone() != null ? associadoDTO.telefone() : this.telefone;
        this.mesPago = associadoDTO.mesPago() != 0 ? associadoDTO.mesPago() : this.mesPago;
        this.anoPago = associadoDTO.anoPago() != 0 ? associadoDTO.anoPago() : this.anoPago;
    }

    public void inativar() {
        this.ativo = false;
    }
}
