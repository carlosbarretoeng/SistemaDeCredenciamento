
package Controller;

import DAO.JPAfunctions;
import Model.Inscricao;
import java.util.ArrayList;

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
}
