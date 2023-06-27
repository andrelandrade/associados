package associados.api.mapper;

import associados.api.dto.AssociadoForm;
import associados.api.model.Associado;
import org.hibernate.boot.jaxb.mapping.AssociationAttribute;
import org.springframework.stereotype.Component;

@Component
public class AssociadoFormMapper implements Mapper<AssociadoForm, Associado> {

    @Override
    public Associado map(AssociadoForm form) {
        var associado = new Associado();
        associado.setNome(form.nome());
        associado.setObservacao(form.observacao());
        associado.setCategoria(form.categoria());
        associado.setDataNascimento(form.dataNascimento());
        associado.setNaturalidade(form.naturalidade());
        associado.setEstadoNatural(form.estadoNatural());
        associado.setEstadoCivil(form.estadoCivil());
        associado.setNacionalidade(form.nacionalidade());
        associado.setEndereco(form.endereco());
        associado.setBairro(form.bairro());
        associado.setCidade(form.cidade());
        associado.setEstado(form.estado());
        associado.setTelefone(form.telefone());
        associado.setMesPago(form.mesPago());
        associado.setAnoPago(form.anoPago());

        return associado;
    }
}
