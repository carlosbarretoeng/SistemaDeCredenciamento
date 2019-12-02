
package Controller;

import Model.Evento;
public class EventoController extends Controller {

    @Override
    public void init() {
        this.class_ = new Evento();
    }
    

    public static double getPorcentagemCred(int eventoId) {
        int presencas = CredenciamentoController.presencasConfirmadas(eventoId), inscricoes = InscricaoController.inscricoesRealizadas(eventoId);
        return inscricoes==0? 0: presencas/inscricoes;
    }
    
    public static double getPorcentagemCred() {
        int presencas = CredenciamentoController.presencasConfirmadas(), inscricoes = InscricaoController.inscricoesRealizadas();
        return inscricoes==0? 0: presencas/inscricoes;
    }
}