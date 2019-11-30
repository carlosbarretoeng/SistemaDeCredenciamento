
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity()
public class Credenciamento extends Base {
    private Date data;
    private String horario;
    @ManyToOne()
    private Usuario usuario;
    @ManyToOne()
    private Inscricao inscricao;

    public Credenciamento() {
    }

}
