
package Controller;

import Model.Pessoa;

public class PessoaController extends Controller{

    @Override
    public void init() {
        this.class_ = new Pessoa();
    }
    
}
