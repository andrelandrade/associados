package associados.api.service;


import associados.api.dto.CadastroAssociadoDTO;
import associados.api.dto.CadastroAssociadoDTOTest;
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

    @Test
    public void cadastraAssociadoTest() {
        // arrange
        CadastroAssociadoDTO cadastroAssociadoDTO = CadastroAssociadoDTOTest.build();
        Associado associado = AssociadoTest.build(cadastroAssociadoDTO);

        when(repository.save(any())).thenReturn(associado);

        // act
        service.cadastrar(cadastroAssociadoDTO);

        // assert
        assertNotNull(associado.getId());
        assertEquals("nome", associado.getNome());
    }

    @Test
    public void recuperaAssociadoTest() {
        Long id = 1L;
        Associado associado = AssociadoTest.build(CadastroAssociadoDTOTest.build());

        when(repository.findById(id)).thenReturn(Optional.of(associado));

        var associadoDetalhado = service.detalhar(id);

        assertNotNull(associadoDetalhado.getId());
        assertEquals("nome", associadoDetalhado.getNome());
    }

    @Test
    public void alteraAssociadoTest() {
        var associadoDTO = new CadastroAssociadoDTO(null, null, null, null, null,
                null, null, null, "endereco alterado", null, null, null,
                null, 6, 2023, 1L);
        Associado associado = AssociadoTest.build(CadastroAssociadoDTOTest.build());

        when(repository.findById(associadoDTO.id())).thenReturn(Optional.of(associado));

        Associado associadoAlterado = service.alterar(associadoDTO);

        assertEquals(1L, associadoAlterado.getId());
        assertEquals("endereco alterado", associadoAlterado.getEndereco());
        assertEquals(6, associadoAlterado.getMesPago());
        assertEquals(2023, associadoAlterado.getAnoPago());
    }
}
