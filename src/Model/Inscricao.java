
package Model;

import com.google.gson.GsonBuilder;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;

@Entity
public class Inscricao extends Base {
    
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data;
    String horario;
    @ManyToOne()
    private Evento evento;
    @ManyToOne() 
    private Usuario usuario;
    @ManyToOne()
    private Pessoa pessoa;

    public Inscricao() {
    }
    
}
