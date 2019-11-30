
package Model;

import javax.persistence.Entity;

@Entity()
public class Usuario extends Base {
    
    private String nome, login, senha, tipo;
    
    public Usuario() {
    }

}
