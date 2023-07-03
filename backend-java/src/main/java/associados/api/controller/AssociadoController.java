package associados.api.controller;

import associados.api.dto.AssociadoForm;
import associados.api.service.AssociadoService;
import jakarta.transaction.Transactional;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping("associados")
public class AssociadoController {
    @Autowired
    private AssociadoService service;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid AssociadoForm dados, UriComponentsBuilder uriBuilder) {
        var associado = service.cadastrar(dados);

        var uri = uriBuilder.path("/associados/{id}").buildAndExpand(associado.getId()).toUri();

        return ResponseEntity.created(uri).body(associado);
    }
}
