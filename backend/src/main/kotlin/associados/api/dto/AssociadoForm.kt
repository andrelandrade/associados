package associados.api.dto

import associados.api.model.Categoria
import java.time.LocalDate

data class AssociadoForm(
    val nome: String,
    val observacao: String,
    val categoria: Categoria,
    val dataNascimento: LocalDate,
    val naturalidade: String,
    val estadoNaturalidade: String,
    val nacionalidade: String,
    val estadoCivil: String,
    val endereco: String,
    val bairro: String,
    val cidade: String,
    val estado: String,
    val telefone: String,
    val mesPago: Int,
    val anoPago: Int
)