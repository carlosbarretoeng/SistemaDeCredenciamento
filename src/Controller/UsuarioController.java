package Controller;

import DAO.JPAfunctions;
import Model.Usuario;

public class UsuarioController extends Controller {

    @Override
    public void init() {
        this.class_ = new Usuario();
    }

    public boolean auth(String login, String senha) {
        return !JPAfunctions.select(Usuario.class, new String[][]{
            {"login", "'" + login + "'"}, {"senha", "'" + senha + "'"}
        }).isEmpty();
    }
    
    public String select(String login) {
        return ((Usuario) JPAfunctions.select(Usuario.class, new String[][]{
            {"login", "'" + login + "'"}
        }).get(0)).objectToJson();
    }
    
}
