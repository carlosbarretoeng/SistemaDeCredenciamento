
package Controller;

import DAO.JPApersistence;
import Model.Base;
import Util.DataType;
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
        this.persistence.salvar(this.class_.jsonToObject(data));
    }
    
    public void delete(int id) {
        this.persistence.excluir(id);
    }
    
    public String select(int id) {
        return this.persistence.recuperar(id).objectToJson();
    }
    
    public ArrayList<String> select() {
        List<Base> result = this.persistence.recuperar();
        ArrayList<String> data = new ArrayList<>();
        result.stream().forEach((obj) -> {
            data.add(obj.objectToJson());
        });
        return data;
    }
    
    public int selectAmount() {
        return this.persistence.quantidade();
    }
    
}