
package Util;

import Controller.UsuarioController;
import DAO.JPAfactory;
import Model.Base;
import View.Main;
import static java.awt.image.ImageObserver.WIDTH;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Conexao extends Base{
    public String driver, host, porta, usuario, senha, banco, estrategia;

    public Conexao(String driver, String host, String porta, String usuario, String senha, String banco, String estrategia) {
        this.driver = driver;
        this.host = host;
        this.porta = porta;
        this.usuario = usuario;
        this.senha = senha;
        this.banco = banco;
        this.estrategia = estrategia;
    }
    
    public boolean testar() {
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection("jdbc:mysql://" + this.host + ":" + this.porta, usuario, senha);
            Statement stmt = con.createStatement();
            stmt.executeUpdate("CREATE DATABASE IF NOT EXISTS " + this.banco);
            stmt.executeUpdate("SET @@global.time_zone = '+3:00'");
            con.close();
        }
        catch (ClassNotFoundException | SQLException e) {
            System.out.println(e);
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
        propriedades.put("javax.persistence.schema-generation.database.action", this.estrategia);
        try {
            JPAfactory.configurar(propriedades);
            new UsuarioController().select();
            this.estrategia = "none";
            Arquivo.escrever("arquivos//conexao.json", this.objectToJson());
        }
        catch(Exception e) {
            this.estrategia = "drop-and-create";
            try {
                Arquivo.escrever("arquivos//conexao.json", this.objectToJson());
            }
            catch (IOException ex) {}
            JOptionPane.showMessageDialog(null, "Você está utilizando uma conexão nova. O sistema precisa ser reiniciado para a criação das tabelas...", "Error", WIDTH, new ImageIcon("icones//error.png"));
            System.exit(0);
        }
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
