package DAO;

import Model.Base;
import java.util.List;

public class JPApersistence <T extends Base> {
    private final Class<T> classePersistente;
    
    public JPApersistence(Class<T> persistedClass){
        this.classePersistente = persistedClass;
    }
    
    public void salvar(T obj) {
        if(obj.getId()>0)
            JPAfunctions.merge(obj);
        else
            JPAfunctions.persist(obj);
    }
    
    public void excluir(int i){
        JPAfunctions.remove(i, classePersistente);
    }
    
    public T recuperar(int id){
        Object obj = JPAfunctions.find(id, classePersistente);
        return (T)obj;
    }
    
    public List<T> recuperar(){
        return (List<T>) JPAfunctions.select(classePersistente);
    }
    
    public List<T> recuperar(String[][] param){
        return (List<T>) JPAfunctions.select(classePersistente, param);
    }
    
    public List<T> recuperar(String param){
        return (List<T>) JPAfunctions.select(classePersistente, param);
    }
    
    public List<T> recuperar_p(String SQL){
        return (List<T>) JPAfunctions.select_p(classePersistente, SQL);
    }
}
