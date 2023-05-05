package associados.api.model

import associados.api.dto.AssociadoForm
import jakarta.persistence.*
import java.time.LocalDate
import java.util.Date

@Entity
@Table(name = "associados")
class Associado(
    var nome: String,
    var observacao: String,
    @Enumerated(EnumType.STRING)
    var categoria: Categoria,
    var dataNascimento: LocalDate,
    var naturalidade: String,
    var estadoNatural: String,
    var estadoCivil: String,
    var nacionalidade: String,
    var endereco: String,
    var bairro: String,
    var cidade: String,
    var estado: String,
    var telefone: String,
    var mesPago: Int,
    var anoPago: Int,
    val dataCadastro: LocalDate = LocalDate.now(),
    val ativo: Boolean = true,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

) {

    fun atualizarInformacoes(form: AssociadoForm) {
        this.nome = form.nome
        this.observacao = form.observacao
        this.categoria = form.categoria
        this.dataNascimento = form.dataNascimento
        this.naturalidade = form.naturalidade
        this.estadoNatural = form.estadoNatural
        this.estadoCivil = form.estadoCivil
        this.nacionalidade = form.nacionalidade
        this.endereco = form.endereco
        this.bairro = form.bairro
        this.cidade = form.cidade
        this.estado = form.estado
        this.telefone = form.telefone
        this.mesPago = form.mesPago
        this.anoPago = form.anoPago
    }
}