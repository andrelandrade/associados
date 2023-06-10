package associados.api.service;


import associados.api.dto.CadastroAssociadoDTO;
import associados.api.model.Associado;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
public class AssociadoServiceTest {

    @InjectMocks
    AssociadoService service;

    @Test
    public void cadastraAssociadoTest() {
        // arrange
        CadastroAssociadoDTO cadastroAssociadoDTO = new CadastroAssociadoDTO();
        //Associado associado = AssociadoTest.build();

        // act
        Associado associado = service.cadastrar(cadastroAssociadoDTO);

        // assert
        assertNotNull(associado.getId());
        assertEquals("Nome", associado.getNome());
    }
}
