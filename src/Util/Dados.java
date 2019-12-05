package Util;

import Controller.Controller;
import DAO.JPAfunctions;
import Model.Base;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import com.thoughtworks.xstream.XStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.json.JSONArray;
import org.json.XML;

public class Dados {


    /**
     * Se a importação for por xml,  se converte o xml em json para facilitar, já que a camada de dados é baseada em json
     */
    public static void importar(Class classe, String caminho, DataType dataType) throws IOException {
        String dados = String.join("", Arquivo.ler(caminho));
        dados = dataType == DataType.JSON? dados: XML.toJSONObject(dados).toString().replace("{\"" + classe.getSimpleName() + "\":", "");
        dados = dataType == DataType.XML? dados.substring(0, dados.length()-1): dados;
        JsonArray array = new JsonParser().parse(dados).getAsJsonArray();
        for (int i = 0; i < array.size(); i++) {
            new Controller() {
                @Override
                public void init() {
                    try {
                        this.class_ = (Base) classe.newInstance();
                    } catch (InstantiationException | IllegalAccessException ex) {
                        Logger.getLogger(Dados.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }.insert(array.get(i).toString());
        }
    }
    
    public static void exportar(Class classe, String caminho, DataType dataType) throws IOException {
        ArrayList data = new ArrayList();
        String json = new Controller() {
            @Override
            public void init() {
                try {
                    this.class_ = (Base) classe.newInstance();
                } catch (InstantiationException | IllegalAccessException ex) {
                    System.out.println(ex);
                }
            }
        }.select().toString();
        data.add(dataType == DataType.JSON? json: "<root>" + XML.toString(new JSONArray(json), classe.getSimpleName()) + "</root>");
        Arquivo.escrever(caminho + "//export-" + classe.getSimpleName() + "-" + new SimpleDateFormat("dd-MM-yyyy-HH-mm-ss").format(new Date()) + (dataType == DataType.JSON?".json":".xml"), data);
    }

}
