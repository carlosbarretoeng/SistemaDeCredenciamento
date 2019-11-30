
package Util;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
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
            ArrayList<String> line = new ArrayList<>();
            line.add(array.get("id").toString());
            for(int i=0; i<fields.length; i++) {
                if(array.get(fields[i].getName()) instanceof JsonObject) {
                    line.add(new Gson().fromJson(array.get(fields[i].getName()), JsonObject.class).get("id").getAsString());
                }
                else if(array.get(fields[i].getName()) instanceof JsonArray) {
                    line.add(String.valueOf(array.get(fields[i].getName()).getAsJsonArray().size()));
                }
                else {
                    line.add(array.get(fields[i].getName()).getAsString());
                }
            }
            modelo.addRow(line.toArray());
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
        try {
            TableRowSorter<TableModel> sorter = new TableRowSorter<>((DefaultTableModel) table.getModel()); 
            sorter.setRowFilter(RowFilter.regexFilter("(?i)" + txt + "(i?)", column));
            table.setRowSorter(sorter);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void filterAnd(JTable table, String[] txts, int[] columns){
        try {
            TableRowSorter<TableModel> sorter = new TableRowSorter<>((DefaultTableModel) table.getModel()); 
            List<RowFilter> filters = new ArrayList<>();
            for(int i=0; i<txts.length; i++) {
                filters.add(RowFilter.regexFilter("(?i)" + txts[i] + "(i?)", columns[i]));
            }
            sorter.setRowFilter(RowFilter.andFilter((Iterable) filters));
            table.setRowSorter(sorter);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}