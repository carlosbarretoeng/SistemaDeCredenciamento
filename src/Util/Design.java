
package Util;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTable;
import javax.swing.table.JTableHeader;

public class Design {
    
    public static final Color UNIFAGOC = new Color(72, 136, 123);
    
    public static void jTable(JTable table) {
        JTableHeader header = table.getTableHeader();
        header.setBackground(Design.UNIFAGOC);
        header.setFont(new Font("Segoe UI", Font.BOLD, 12));
        header.setForeground(Color.white);
        table.setRowHeight(25);
        table.setSelectionBackground(UNIFAGOC);
        table.setSelectionForeground(Color.white);
    }
}
