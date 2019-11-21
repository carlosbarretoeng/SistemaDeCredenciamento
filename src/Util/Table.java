
package Util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

public class Table {
    
    public static void fill(ArrayList<String> data, JTable table, Class classe){
        DefaultTableModel modelo = new DefaultTableModel();
                    
        Field[] fields = classe.getDeclaredFields();
        
        modelo.addColumn("id");
        for (Field field : fields) {
            modelo.addColumn(field.getName());
        }
        
        for(String json: data) {
            JsonElement element = new Gson().fromJson(json, JsonObject.class);
            JsonObject array = element.getAsJsonObject();
            String[] line = new String[fields.length+1];
            line[0] = array.get("id").toString();
            for(int i=0; i<fields.length; i++) {
                if(array.get(fields[i].getName()) instanceof JsonObject) {
                    line[i+1] = new Gson().fromJson(array.get(fields[i].getName()), JsonObject.class).get("id").getAsString();
                }
                else if(array.get(fields[i].getName()) instanceof JsonArray) {
                    line[i+1] = String.valueOf(array.get(fields[i].getName()).getAsJsonArray().size());
                }
                else {
                    line[i+1] = array.get(fields[i].getName()).getAsString();
                }
            }
            modelo.addRow(line);
        }
        table.setModel(modelo);
        if (table.getRowCount() > 0)
            table.setRowSelectionInterval(0, 0);
    }
    
    public static int getColumnIndex(JTable table, String header) {
        for (int i=0; i < table.getColumnCount(); i++) {
            if (table.getColumnName(i).equals(header)) return i;
        }
        return -1;
    }
    
    public static void filter(JTable table, String txt, int column){
        try{
            TableRowSorter<TableModel> sorter = new TableRowSorter<TableModel>((DefaultTableModel) table.getModel()); 
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txt + "(i?)", column));
            table.setRowSorter(sorter);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}