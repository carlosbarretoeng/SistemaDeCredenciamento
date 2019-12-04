
package Controller;

import DAO.JPAfactory;
import Model.Credenciamento;
import Model.Pessoa;
import java.util.ArrayList;
import javax.persistence.EntityManager;

public class CredenciamentoController extends Controller{

    @Override
    public void init() {
        this.class_ = new Credenciamento();
    }
    
    public static int presencasConfirmadas(int evento) {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select count(*) from Model.Credenciamento c, Model.Inscricao i where c.inscricao=i.id and i.evento=" + evento;
        return Integer.parseInt(manager.createQuery(SQL).getResultList().get(0).toString());
    }
    
    public static ArrayList<String> pessoasConfirmadas(int evento, String dataMin, String dataMax) {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select p from Model.Pessoa p, Model.Credenciamento c, Model.Inscricao i where cast(c.data as date)>='" + dataMin + "' and cast(c.data as date)<='" + dataMax + "' and p.id=i.pessoa and c.inscricao=i.id and i.evento=" + evento;
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) manager.createQuery(SQL).getResultList();
        ArrayList<String> data = new ArrayList<>();
        pessoas.stream().forEach((p) -> {
            data.add(p.objectToJson());
        });
        return data;
    }
    
    public static ArrayList<String> pessoasConfirmadas(int evento) {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select p from Model.Pessoa p, Model.Credenciamento c, Model.Inscricao i where p.id=i.pessoa and c.inscricao=i.id and i.evento=" + evento;
        ArrayList<Pessoa> pessoas = (ArrayList<Pessoa>) manager.createQuery(SQL).getResultList();
        ArrayList<String> data = new ArrayList<>();
        pessoas.stream().forEach((p) -> {
            data.add(p.objectToJson());
        });
        return data;
    }
    
    public static int presencasConfirmadas() {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select count(*) from Model.Credenciamento c, Model.Inscricao i where c.inscricao=i.id";
        return Integer.parseInt(manager.createQuery(SQL).getResultList().get(0).toString());
    }
    
}
