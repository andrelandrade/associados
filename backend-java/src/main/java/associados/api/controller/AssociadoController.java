package associados.api.controller;

import associados.api.dto.AssociadoForm;
import associados.api.mapper.AssociadoMapper;
import associados.api.service.AssociadoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
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

        var uri = uriBuilder.path("/associados/{id}").buildAndExpand(associado.getId()).toUri();

        return ResponseEntity.created(uri).body(associado);
    }

    @GetMapping("/{id}")
    public ResponseEntity detalhar(@PathVariable Long id) {
        return ResponseEntity.ok(service.detalhar(id));
    }
}
