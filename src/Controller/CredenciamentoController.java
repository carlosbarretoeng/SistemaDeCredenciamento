
package Controller;

import DAO.JPAfactory;
import Model.Credenciamento;
import javax.persistence.EntityManager;
import javax.persistence.Query;

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
    
    public static int presencasConfirmadas() {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select count(*) from Model.Credenciamento c, Model.Inscricao i where c.inscricao=i.id";
        return Integer.parseInt(manager.createQuery(SQL).getResultList().get(0).toString());
    }
    
}
