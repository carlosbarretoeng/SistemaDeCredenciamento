package Util;

import Controller.Controller;
import Model.Base;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Dados {

    private final Gson gson = new Gson();

    public static void importar(Class classe, String caminho, DataType dataType) throws IOException {
        String dados = String.join("", Arquivo.ler(caminho));
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
        data.add(new Controller() {
            @Override
            public void init() {
                try {
                    this.class_ = (Base) classe.newInstance();
                } catch (InstantiationException | IllegalAccessException ex) {
                    System.out.println(ex);
                }
            }
        }.select().toString());
        Arquivo.escrever(caminho + "export.json", data);
    }

}
