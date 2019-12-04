
package Controller;

import DAO.JPAfactory;
import Model.Evento;
import javax.persistence.EntityManager;

public class EventoController extends Controller {

    @Override
    public void init() {
        this.class_ = new Evento();
    }

    public static double getPorcentagemCred(int eventoId) {
        int presencas = CredenciamentoController.presencasConfirmadas(eventoId), inscricoes = InscricaoController.inscricoesRealizadas(eventoId);
        return inscricoes==0? 0: (double)presencas/(double)inscricoes;
    }
    
    public static double getPorcentagemCred() {
        int presencas = CredenciamentoController.presencasConfirmadas(), inscricoes = InscricaoController.inscricoesRealizadas();
        return inscricoes==0? 0: (double)presencas/(double)inscricoes;
    }
    
    public static boolean isFull(int id) {
        EntityManager manager = JPAfactory.getManager(); 
        String SQL = "select count(*)>=e.capacidade from Model.Evento e, Model.Inscricao i where i.evento=e.id and e.id=" + id;
        return (boolean) manager.createQuery(SQL).getResultList().get(0);
    }
    
}