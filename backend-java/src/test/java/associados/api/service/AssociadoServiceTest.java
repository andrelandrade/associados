package associados.api.service;


import associados.api.dto.AssociadoForm;
import associados.api.dto.AssociadoFormTest;
import associados.api.mapper.AssociadoFormMapper;
import associados.api.model.Associado;
import associados.api.model.AssociadoTest;
import associados.api.repository.AssociadoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class AssociadoServiceTest {

    @InjectMocks
    AssociadoService service;

    @Mock
    AssociadoRepository repository;

    @Mock
    AssociadoFormMapper associadoFormMapper;

    @Test
    public void cadastraAssociadoTest() {
        // arrange
        AssociadoForm associadoForm = AssociadoFormTest.build();
        Associado associado = AssociadoTest.build(associadoForm);

        when(repository.save(any())).thenReturn(associado);
        when(associadoFormMapper.map(associadoForm)).thenReturn(associado);

        // act
        service.cadastrar(associadoForm);

        // assert
        assertNotNull(associado.getId());
        assertEquals("nome", associado.getNome());
    }

    @Test
    public void recuperaAssociadoTest() {
        Long id = 1L;
        Associado associado = AssociadoTest.build(AssociadoFormTest.build());

        when(repository.findById(id)).thenReturn(Optional.of(associado));

        var associadoDetalhado = service.detalhar(id);

        assertNotNull(associadoDetalhado.getId());
        assertEquals("nome", associadoDetalhado.getNome());
    }

    @Test
    public void alteraAssociadoTest() {
        var associadoDTO = new AssociadoForm(1L, null, null, null, null, null,
                null, null, null, "endereco alterado", null, null, null,
                null, 6, 2023);
        Associado associado = AssociadoTest.build(AssociadoFormTest.build());

        when(repository.findById(associadoDTO.id())).thenReturn(Optional.of(associado));

        Associado associadoAlterado = service.alterar(associadoDTO);

        assertEquals(1L, associadoAlterado.getId());
        assertEquals("endereco alterado", associadoAlterado.getEndereco());
        assertEquals(6, associadoAlterado.getMesPago());
        assertEquals(2023, associadoAlterado.getAnoPago());
    }
}
