package regresponsavel.model;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "codigoPessoa")
@Table(name = "responsavel")
public class ResponsavelModel extends PessoaModel {

    public ResponsavelModel() {
        super();    
    }
}
