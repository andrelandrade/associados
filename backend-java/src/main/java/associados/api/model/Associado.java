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

}
