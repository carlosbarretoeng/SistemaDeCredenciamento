
package DAO;

import java.util.HashMap;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class JPAfactory {
    private static EntityManagerFactory factory = null;
    private static final String UN_NAME = "QReventPU";
    private static HashMap propriedades = null;
    
    private JPAfactory() {
        factory = Persistence.createEntityManagerFactory(UN_NAME, JPAfactory.propriedades);
    }
    
    public static EntityManager getManager(){
        try{
            if(factory==null){
                JPAfactory con = new JPAfactory();
                System.out.println("Conexão JPA aberta!");
            }
            return factory.createEntityManager(JPAfactory.propriedades);
        }
        catch(Exception e){
            System.out.println("Erro ao abrir conexão JPA ou criar gerenciador! " + e);
            return null;
        }
    }
    
    public static void configurar(HashMap propriedades) {
        JPAfactory.propriedades = propriedades;
    }
    
    public static void closeFactory(){
        factory.close();
    }
}
