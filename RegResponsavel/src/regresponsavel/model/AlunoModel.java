package regresponsavel.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@PrimaryKeyJoinColumn(name = "codigoPessoa")
@Table(name = "aluno")
public class AlunoModel extends PessoaModel {

    @Column(unique = true)
    private String prontuario;
    
    public AlunoModel() {
        super();
    }

    public String getProntuario() {
        return prontuario;
    }

    public void setProntuario(String prontuario) {
        this.prontuario = prontuario;
    }
}
