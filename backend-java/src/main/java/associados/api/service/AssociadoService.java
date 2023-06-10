package associados.api.service;

import associados.api.dto.CadastroAssociadoDTO;
import associados.api.model.Associado;
import org.springframework.stereotype.Service;

@Service
public class AssociadoService {
    public Associado cadastrar(CadastroAssociadoDTO cadastroAssociadoDTO) {
        return new Associado();
    }
}
