
package Model;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Temporal;

@Entity
public class Evento extends Base {
    
    private String nome, descricao, local;
    private int capacidade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_inicio, data_termino;
    private String horario_inicio, horario_termino;

}
