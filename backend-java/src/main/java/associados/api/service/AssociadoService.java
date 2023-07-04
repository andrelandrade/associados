package associados.api.service;

import associados.api.dto.AssociadoForm;
import associados.api.mapper.AssociadoFormMapper;
import associados.api.mapper.AssociadoMapper;
import associados.api.model.Associado;
import associados.api.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    @Autowired
    private AssociadoFormMapper associadoFormMapper;

    @Autowired
    private AssociadoMapper associadoMapper;

    public Associado cadastrar(AssociadoForm associadoForm) {
        var associado = associadoFormMapper.map(associadoForm);

        repository.save(associado);

        return associado;
    }

    public AssociadoForm detalhar(Long id) {
        var associado = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Associado não encontrado"));

        return associadoMapper.map(associado);
    }

    public Associado alterar(AssociadoForm associadoForm) {
        Associado associado = repository.findById(associadoForm.id())
                .orElseThrow(() -> new IllegalArgumentException("Associado não encontrado"));

        associado.atualiza(associadoForm);

        return associado;
    }

    public void excluir(Long id) {
        Associado associado = repository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Associado não encontrado"));

        associado.setAtivo(false);
    }
}
