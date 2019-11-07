
package Model;

import java.util.Date;
import javax.persistence.Entity;

@Entity
public class Evento extends Base {
    
    private String nome, descricao, local, horario_inicio, horario_termino;
    private int capacidade;
    private Date data_inicio, data_termino;

    public Evento(String nome, String descricao, String local, String horario_inicio, String horario_termino, int capacidade, Date data_inicio, Date data_termino) {
        this.nome = nome;
        this.descricao = descricao;
        this.local = local;
        this.horario_inicio = horario_inicio;
        this.horario_termino = horario_termino;
        this.capacidade = capacidade;
        this.data_inicio = data_inicio;
        this.data_termino = data_termino;
    }

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

    public String getHorario_inicio() {
        return horario_inicio;
    }

    public void setHorario_inicio(String horario_inicio) {
        this.horario_inicio = horario_inicio;
    }

    public String getHorario_termino() {
        return horario_termino;
    }

    public void setHorario_termino(String horario_termino) {
        this.horario_termino = horario_termino;
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
