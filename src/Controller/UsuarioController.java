package Controller;

import DAO.JPAfunctions;
import Model.Usuario;

public class UsuarioController extends Controller {

    @Override
    public void init() {
        this.class_ = new Usuario();
    }

    public boolean auth(String login, String senha) {
        //senha = Encrypt.run(senha);
        return !JPAfunctions.select(Usuario.class, new String[][]{
            {"login", "'" + login + "'"}, {"senha", "'" + senha + "'"}
        }).isEmpty();

    }
    
}
