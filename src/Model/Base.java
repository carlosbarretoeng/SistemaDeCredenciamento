package Model;

import com.google.gson.GsonBuilder;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.StaxDriver;
import java.io.Serializable;
import javax.persistence.*;

@MappedSuperclass
public abstract class Base implements Serializable {

    @Id()
    @GeneratedValue(strategy = GenerationType.AUTO)
    protected int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Base jsonToObject(String json) {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create().fromJson(json, this.getClass());
    }

    public String objectToJson() {
        return new GsonBuilder().setDateFormat("yyyy-MM-dd").create().toJson(this);
    }
    
    public Base xmlToObject(String xml) {
        return (Base) new XStream(new StaxDriver()).fromXML(xml);
    }

    public String objectToXml() {
        return new XStream(new StaxDriver()).toXML(this);
    }
    
}