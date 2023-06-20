package associados.api.model;

import associados.api.dto.CadastroAssociadoDTO;
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

    public Associado(CadastroAssociadoDTO cadastroAssociadoDTO) {
        this.nome = cadastroAssociadoDTO.nome();
        this.observacao = cadastroAssociadoDTO.observacao();
        this.categoria = cadastroAssociadoDTO.categoria();
        this.dataNascimento = cadastroAssociadoDTO.dataNascimento();
        this.naturalidade = cadastroAssociadoDTO.naturalidade();
        this.estadoNatural = cadastroAssociadoDTO.estadoNatural();
        this.estadoCivil = cadastroAssociadoDTO.estadoCivil();
        this.nacionalidade = cadastroAssociadoDTO.nacionalidade();
        this.endereco = cadastroAssociadoDTO.endereco();
        this.bairro = cadastroAssociadoDTO.bairro();
        this.cidade = cadastroAssociadoDTO.cidade();
        this.estado = cadastroAssociadoDTO.estado();
        this.telefone = cadastroAssociadoDTO.telefone();
        this.mesPago = cadastroAssociadoDTO.mesPago();
        this.anoPago = cadastroAssociadoDTO.anoPago();
    }

    public void atualiza(CadastroAssociadoDTO associadoDTO) {
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
}
