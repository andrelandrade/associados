package associados.api.service;


import associados.api.dto.AssociadoForm;
import associados.api.dto.AssociadoFormTest;
import associados.api.mapper.AssociadoFormMapper;
import associados.api.mapper.AssociadoMapper;
import associados.api.mapper.AssociadoViewMapper;
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

    @Mock
    AssociadoMapper associadoMapper;

    @Mock
    AssociadoViewMapper associadoViewMapper;

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
        assertNotNull(associado.getDataCadastro());
        assertTrue(associado.isAtivo());
    }

    @Test
    public void recuperaAssociadoTest() {
        Long id = 1L;
        Associado associado = AssociadoTest.build(AssociadoFormTest.build());
        AssociadoForm associadoForm = AssociadoFormTest.build();

        when(repository.findById(id)).thenReturn(Optional.of(associado));
        when(associadoMapper.map(associado)).thenReturn(associadoForm);

        var associadoDetalhado = service.detalhar(id);

        assertNotNull(associadoDetalhado.id());
        assertEquals("nome", associadoDetalhado.nome());
    }

    @Test
    public void alteraAssociadoTest() {
        var associadoDTO = new AssociadoForm(1L, null, null, null, null, null,
                null, null, null, "endereco alterado", null, null, null,
                null, 6, 2023);
        Associado associado = AssociadoTest.build(AssociadoFormTest.build());

        when(repository.findById(associadoDTO.id())).thenReturn(Optional.of(associado));
        when(associadoMapper.map(associado)).thenReturn(associadoDTO);

        AssociadoForm associadoAlterado = service.alterar(1L, associadoDTO);

        assertEquals(1L, associadoAlterado.id());
        assertEquals("endereco alterado", associadoAlterado.endereco());
        assertEquals(6, associadoAlterado.mesPago());
        assertEquals(2023, associadoAlterado.anoPago());
    }

    @Test
    public void  excluiAssociadoTest() {
        Long id = 1L;
        Associado associado = AssociadoTest.build(AssociadoFormTest.build());

        when(repository.getReferenceById(id)).thenReturn(associado);

        service.excluir(id);

        assertFalse(associado.isAtivo());
    }
}
