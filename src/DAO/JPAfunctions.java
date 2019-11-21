
package DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.Query;

public class JPAfunctions {
    
    public static EntityManager openTransaction(){
        EntityManager manager = JPAfactory.getManager();
        manager.getTransaction().begin();
        return manager;
    }
    
    public static void closeTransaction(EntityManager manager, boolean bCommit){
        if(bCommit){
            manager.getTransaction().commit();
        }
        else{
            manager.getTransaction().rollback();
        }
        manager.close();
    }
    
    public static void persist(Object object){
        EntityManager manager = openTransaction();
        manager.persist(object);
        closeTransaction(manager, true);
    }
    
    public static void merge(Object object){
        EntityManager manager = openTransaction();
        manager.merge(object);
        closeTransaction(manager, true);
    }
    
    public static void remove(int key, Class c){
        EntityManager manager = openTransaction();
        Object object = manager.find(c, key);
        manager.remove(object);
        closeTransaction(manager, true);
    }
    
    public static Object find(int key, Class c){
        EntityManager manager = openTransaction();
        Object object = manager.find(c, key);
        closeTransaction(manager, true);
        return object;
    }
    
    public static List<?> select(Class c, String whereJPQL){
        EntityManager manager = JPAfactory.getManager();
        String SQL = "select u from " + c.getName()+ " u " + whereJPQL;
        Query query = manager.createQuery(SQL);
        return query.getResultList();
    }
    
    public static List<?> select_p(Class c, String sql){
        EntityManager manager = JPAfactory.getManager();
        Query query = manager.createQuery(sql);
        return query.getResultList();
    }
   
    public static List<?> select(Class c, String[][] parametros){
        String sWhere = "";
        if (parametros.length > 0) {            
            for (int i = 0; i < parametros.length; i++) {                
                if (i == 0)
                    sWhere = sWhere + " where ";
                else
                    sWhere = sWhere + " and ";
            
                String campo = parametros[i][0];
                String valor = parametros[i][1];
                
                sWhere = sWhere + campo + " = " + valor;                
            }
        }
        return select(c, sWhere);
    }
    
    public static List<?> select(Class classe){
        return select(classe, "");
    }
}
