
package Model;

import javax.persistence.Entity;

@Entity()
public class Pessoa extends Base {
    
    private String nome, cpf, rg, endereco, cidade, telefone, email;
    private int matricula;

    public Pessoa() {
    }

}
