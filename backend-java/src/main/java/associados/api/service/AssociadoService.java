package associados.api.service;

import associados.api.dto.CadastroAssociadoDTO;
import associados.api.model.Associado;
import associados.api.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    public Associado cadastrar(CadastroAssociadoDTO cadastroAssociadoDTO) {
        var associado = new Associado(cadastroAssociadoDTO);

        repository.save(associado);

        return associado;
    }
}
