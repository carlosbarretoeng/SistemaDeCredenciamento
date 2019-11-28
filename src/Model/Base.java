package Model;

import com.google.gson.Gson;
import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public abstract class Base implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Base jsonToObject(String json) {
        return new Gson().fromJson(json, this.getClass());
    }

    public String objectToJson() {
        return new Gson().toJson(this);
    }
    
}