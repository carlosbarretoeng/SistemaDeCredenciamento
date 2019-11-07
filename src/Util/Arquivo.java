
package Util;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Arquivo {
    
    public static ArrayList<String> ler(String path) {
        ArrayList<String> dados = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader(path));
            String linha = "";
            while((linha = reader.readLine())!=null) {
                dados.add(linha);
            }
            reader.close();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao ler arquivo: " + path);
        } 
        return dados;
    }
    
    public static void escrever(String path, ArrayList<String> dados) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(path));
            for(String linha: dados) {
                writer.write(linha + "\n");
            }
            writer.close();
        }
        catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo: " + path);
        } 
    }
    
}
