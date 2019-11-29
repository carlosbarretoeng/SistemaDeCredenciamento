package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Arquivo {

    public static ArrayList<String> ler(String path) throws IOException {
        ArrayList<String> dados = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new FileReader(path));
        String linha = "";
        while ((linha = reader.readLine()) != null) {
            dados.add(linha);
        }
        reader.close();

        return dados;
    }

    public static void escrever(String path, ArrayList<String> dados) throws IOException {
        File file = new File(path);
        BufferedWriter writer = new BufferedWriter(new FileWriter(path));
        for (String linha : dados) {
            writer.write(linha + "\n");
        }
        writer.close();

    }
    
    public static void escrever(String path, String dados) throws IOException {
        File file = new File(path);
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path))) {
            writer.write(dados + "\n");
            writer.close();
        }
    }

}
