
package Util;

import Controller.UsuarioController;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;

public class AuthService {
    public static JsonObject usuario = (JsonObject) new JsonParser().parse(new UsuarioController().select(1));
    
    public static void setUsuario(String login) {
        AuthService.usuario = (JsonObject) new JsonParser().parse(new UsuarioController().select(login));
    }
    
    public static JsonObject getUsuario() {
        return usuario;
    }
}
