
package Model;

import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity()
public class Pessoa extends Base {
    
    private String nome, cpf, rg, endereco, cidade, telefone, email;
    private int matricula;

    public Pessoa() {
    }

}
