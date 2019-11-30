
package Model;

import java.util.ArrayList;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;

@Entity
public class Evento extends Base {
    
    private String nome, descricao, local;
    private int capacidade;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date data_inicio, data_termino;
    private String horario_inicio, horario_termino;

    public Evento() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public Date getData_inicio() {
        return data_inicio;
    }

    public void setData_inicio(Date data_inicio) {
        this.data_inicio = data_inicio;
    }

    public Date getData_termino() {
        return data_termino;
    }

    public void setData_termino(Date data_termino) {
        this.data_termino = data_termino;
    }

}
