package associados.api.mapper;

import associados.api.dto.AssociadoForm;
import associados.api.model.Associado;
import org.hibernate.boot.jaxb.mapping.AssociationAttribute;

public class AssociadoFormMapper implements Mapper<AssociadoForm, Associado> {

    @Override
    public Associado map(AssociadoForm form) {

        return new Associado(
            form.nome(),
            form.observacao(),
            form.categoria(),
            form.dataNascimento(),
            form.naturalidade(),
            form.estadoNatural(),
            form.estadoCivil(),
            form.nacionalidade(),
            form.endereco(),
            form.bairro(),
            form.cidade(),
            form.estado(),
            form.telefone(),
            form.mesPago(),
            form.anoPago(),
            null,
            true,
            null
        );
    }
}
