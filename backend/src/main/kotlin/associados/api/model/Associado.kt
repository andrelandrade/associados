package associados.api.model

import jakarta.persistence.*
import java.time.LocalDate
import java.util.Date

@Entity
@Table(name = "associados")
class Associado(
    val nome: String,
    val observacao: String,
    @Enumerated(EnumType.STRING)
    val categoria: Categoria,
    val dataNascimento: LocalDate,
    val naturalidade: String,
    val estadoNatural: String,
    val nacionalidade: String,
    val endereco: String,
    val bairro: String,
    val estado: String,
    val telefone: String,
    val mesPago: Int,
    val anoPago: Int,
    val dataCadastro: LocalDate = LocalDate.now(),
    val ativo: Boolean = true,

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long? = null,

) {
}