package Model;

//testando commit

import Util.DateDeserializer;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.StringWriter;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.*;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;

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
        return new GsonBuilder().registerTypeHierarchyAdapter(Date.class, new DateDeserializer()).create().fromJson(json, this.getClass());
    }

    public String objectToJson() {
        return new GsonBuilder().registerTypeHierarchyAdapter(Date.class, new DateDeserializer()).create().toJson(this);
    }
    
}
