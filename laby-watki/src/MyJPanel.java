import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;

public class MyJPanel extends JPanel {

    public MyJPanel() {
        setBackground(new Color(40, 200, 150));

        addMouseMotionListener(new MouseMotionListener() {
            @Override
            public void mouseDragged(MouseEvent e) {

            }

            @Override
            public void mouseMoved(MouseEvent e) {
                System.out.println(" x: " + e.getX() + " " );
            }
        });
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        g.drawRect(100, 100, 100, 100);

    }
}
