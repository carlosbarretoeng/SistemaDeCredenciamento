
package Model;

import java.util.Date;
import javax.persistence.Entity;
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

    public Inscricao(Date data, Evento evento, Usuario usuario, Pessoa pessoa) {
        this.data = data;
        this.evento = evento;
        this.usuario = usuario;
        this.pessoa = pessoa;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Evento getEvento() {
        return evento;
    }

    public void setEvento(Evento evento) {
        this.evento = evento;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }
    
}
