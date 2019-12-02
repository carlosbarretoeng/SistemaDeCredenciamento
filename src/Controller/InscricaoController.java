
package Controller;

import DAO.JPAfactory;
import DAO.JPAfunctions;
import Model.Inscricao;
import Model.Pessoa;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class InscricaoController extends Controller {

    @Override
    public void init() {
        this.class_ = new Inscricao();
    }
    
    public ArrayList<String> select(String[][] params) {
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Inscricao> inscricoes = (ArrayList<Inscricao>) JPAfunctions.select(Inscricao.class, params);
        inscricoes.stream().forEach((i) -> {
            data.add(i.objectToJson());
        });
        return data;
    }
    
    public boolean inscrito(String[][] params) {
        return !JPAfunctions.select(Inscricao.class, params).isEmpty();
    }
    
    public ArrayList<String> getPessoas(int eventoId) {
        EntityManager manager = JPAfactory.getManager();
        String SQL = "select p from Model.Inscricao i, Model.Pessoa p where p.id = i.pessoa and i.evento = " +eventoId + " and i.id not in (select inscricao from Model.Credenciamento)";
        Query query = manager.createQuery(SQL);
        ArrayList<String> data = new ArrayList<>();
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) query.getResultList();
        pessoas.stream().forEach((pessoa) -> {
            data.add(pessoa.objectToJson());
        });
        return data;
    }
    
    public String getInscricao(int eventoId, int pessoaId) {
        EntityManager manager = JPAfactory.getManager();
        String SQL = "select i from Model.Inscricao i, Model.Pessoa p where p.id = i.pessoa and i.evento = " +eventoId + " and p.id = " + pessoaId;
        Query query = manager.createQuery(SQL);
        return ((Inscricao) query.getResultList().get(0)).objectToJson();
    }
}
