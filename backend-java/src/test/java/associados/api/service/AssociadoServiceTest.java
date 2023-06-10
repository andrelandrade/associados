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
}
