package associados.api.repository;

import associados.api.dto.AssociadoView;
import associados.api.model.Associado;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AssociadoRepository extends JpaRepository<Associado, Long> {

}
