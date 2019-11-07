
package Controller;

import DAO.JPApersistence;
import Model.Base;
import java.util.ArrayList;
import java.util.List;

public abstract class Controller {
    
    protected JPApersistence persistence = null;
    protected Base class_;
    
    public abstract void init();
    
    public Controller() {
        this.init();
        this.persistence = new JPApersistence(this.class_.getClass());
    }
    
    public void insert(String data) {
        this.persistence.salvar(this.class_.toObject(data));
    }
    
    public void delete(int id) {
        this.persistence.excluir(id);
    }
    
    public String select(int id) {
        return this.persistence.recuperar(id).toJson();
    }
    
    public ArrayList<String> select() {
        List<Base> result = this.persistence.recuperar();
        ArrayList<String> data = new ArrayList<>();
        result.stream().forEach((obj) -> {
            data.add(obj.toJson());
        });
        return data;
    }
}