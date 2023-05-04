package associados.api.repository

import associados.api.model.Associado
import org.springframework.data.jpa.repository.JpaRepository

interface AssociadoRepository: JpaRepository<Associado, Long> {

}
