
package View;

import java.awt.Component;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.HashMap;
import java.util.Map;

/**
 * Classe criada pra a funcionalidade de arrastar e soltar dos componentes. Recebe como parâmetro o component âncora e o componente a ser arrastado.
**/
public class Dragged {
    
    public static Map<Component, Integer> clickX = new HashMap<>(), clickY = new HashMap<>();

    public Dragged(Component clicked, Component moved) {
        
        Dragged.clickX.put(clicked, 0);
        Dragged.clickY.put(clicked, 0);

        clicked.addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {
                moved.setLocation(e.getX()+moved.getX()-Dragged.clickX.get(clicked), e.getY()+moved.getY()-Dragged.clickY.get(clicked));
            }
            @Override
            public void mouseMoved(MouseEvent e) {}
        });
        clicked.addMouseListener(new MouseListener() {
            @Override
            public void mousePressed(MouseEvent e) {
                Dragged.clickX.put(clicked, e.getX());
                Dragged.clickY.put(clicked, e.getY());
            }
            @Override
            public void mouseReleased(MouseEvent e) {}
            @Override
            public void mouseEntered(MouseEvent e) {}
            @Override
            public void mouseExited(MouseEvent e) {}
            @Override
            public void mouseClicked(MouseEvent e) {}
        });
    }
}
