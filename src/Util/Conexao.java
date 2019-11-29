
package Util;

import DAO.JPAfactory;
import Model.Base;
import View.Main;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conexao extends Base{
    public String driver, host, porta, usuario, senha, banco;

    public Conexao(String driver, String host, String porta, String usuario, String senha, String banco) {
        this.driver = driver;
        this.host = host;
        this.porta = porta;
        this.usuario = usuario;
        this.senha = senha;
        this.banco = banco;
    }
    
    public boolean testar() {
        try {
            Class.forName(driver);
            DriverManager.getConnection(url(), usuario, senha);
        } catch (ClassNotFoundException | SQLException e) {
            return false;
        }
        return true;
    }
    
    public void configurar() {
        HashMap propriedades = new HashMap<String, String>();
        propriedades.put("javax.persistence.jdbc.driver", this.driver);
        propriedades.put("javax.persistence.jdbc.url", this.url());
        propriedades.put("javax.persistence.jdbc.user", this.usuario);
        propriedades.put("javax.persistence.jdbc.password", this.senha);
        JPAfactory.configurar(propriedades);
    }
    
    public String url() {
        return "jdbc:mysql://" + host + ":" + porta + "/" + banco;
    }
    
    public void salvar() {
        try {
            Arquivo.escrever("arquivos//conexao.json", this.objectToJson());
            JOptionPane.showMessageDialog(null, "Configuração de conexão salva com sucesso!", "Sucesso", 0, new ImageIcon("icones//success.png"));
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo!", "Error", 0, new ImageIcon("icones//error.png"));
        }
    }

    public Conexao() {
    }
    
    public static Conexao get() {
        try {
            return (Conexao) new Conexao().jsonToObject(Arquivo.ler("arquivos//conexao.json").stream().collect(Collectors.joining(" ")));
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
