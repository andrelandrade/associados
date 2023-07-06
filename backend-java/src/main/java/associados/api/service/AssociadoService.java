package associados.api.service;

import associados.api.dto.AssociadoForm;
import associados.api.dto.AssociadoView;
import associados.api.mapper.AssociadoFormMapper;
import associados.api.mapper.AssociadoMapper;
import associados.api.mapper.AssociadoViewMapper;
import associados.api.model.Associado;
import associados.api.repository.AssociadoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssociadoService {

    @Autowired
    private AssociadoRepository repository;

    @Autowired
    private AssociadoFormMapper associadoFormMapper;

    @Autowired
    private AssociadoMapper associadoMapper;

    @Autowired
    private AssociadoViewMapper associadoViewMapper;

    public AssociadoView cadastrar(AssociadoForm associadoForm) {
        var associado = associadoFormMapper.map(associadoForm);

        repository.save(associado);

        return associadoViewMapper.map(associado);
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
        Associado associado = repository.getReferenceById(id);

        associado.inativar();
    }

    public Page<AssociadoView> listar(Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(AssociadoView::new);
    }
}
