
package Controller;

import Model.Pessoa;
import Util.DataType;

public class PessoaController extends Controller{

    @Override
    public void init() {
        this.class_ = new Pessoa();
    }
    
}
