package associados.api.service;

import associados.api.dto.CadastroAssociadoDTO;
import associados.api.model.Associado;
import associados.api.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    public Associado cadastrar(CadastroAssociadoDTO cadastroAssociadoDTO) {
        var associado = new Associado(cadastroAssociadoDTO);

        repository.save(associado);

        return associado;
    }

    public Associado detalhar(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Associado não encontrado"));
    }

    public Associado alterar(CadastroAssociadoDTO cadastroAssociadoDTO) {
        Associado associado = repository.findById(cadastroAssociadoDTO.id())
                .orElseThrow(() -> new IllegalArgumentException("Associado não encontrado"));

        associado.atualiza(cadastroAssociadoDTO);

        return associado;
    }
}
