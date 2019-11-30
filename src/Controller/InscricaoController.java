
package Controller;

import DAO.JPAfunctions;
import Model.Inscricao;

public class InscricaoController extends Controller {

    @Override
    public void init() {
        this.class_ = new Inscricao();
    }
    
}
