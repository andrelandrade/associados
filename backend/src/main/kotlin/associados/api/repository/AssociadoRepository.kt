package associados.api.repository

import associados.api.model.Associado
import org.springframework.data.domain.Page
import org.springframework.data.domain.Pageable
import org.springframework.data.jpa.repository.JpaRepository

interface AssociadoRepository : JpaRepository<Associado, Long> {
    fun findAllByAtivoTrue(pageable: Pageable ): Page<Associado>
}
