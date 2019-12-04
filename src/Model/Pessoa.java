
package Model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity()
public class Pessoa extends Base {
    
    private String nome, rg, endereco, cidade, telefone, email;
    @Column(unique = true)
    private String cpf;
    @Column(unique = true)
    private int matricula;

    public Pessoa() {
    }

}
