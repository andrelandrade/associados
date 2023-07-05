package associados.api.controller;

import associados.api.dto.AssociadoForm;
import associados.api.dto.AssociadoView;
import associados.api.mapper.AssociadoMapper;
import associados.api.mapper.AssociadoViewMapper;
import associados.api.service.AssociadoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("associados")
public class AssociadoController {
    @Autowired
    private AssociadoService service;

    @Autowired
    private AssociadoMapper associadoMapper;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid AssociadoForm dados, UriComponentsBuilder uriBuilder) {
        var associado = service.cadastrar(dados);

        var uri = uriBuilder.path("/associados/{id}").buildAndExpand(associado.id()).toUri();

        return ResponseEntity.created(uri).body(associado);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        return ResponseEntity.ok(service.detalhar(id));
    }

    @GetMapping
    public ResponseEntity<Page<AssociadoView>> listar(@PageableDefault(size = 10, sort = {"id"}) Pageable paginacao) {
        return ResponseEntity.ok(service.listar(paginacao));
    }
}
