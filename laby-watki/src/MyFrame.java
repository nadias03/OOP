
import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame() {
        setTitle("Moja ramka");
        setPreferredSize(new Dimension(600, 600));

        JPanel jPanel = new JPanel();

        MyJPanel myJPanel = new MyJPanel();
        myJPanel.setPreferredSize(new Dimension(200, 200));
        jPanel.add(myJPanel);

        MyButtonPanel myButtonPanel = new MyButtonPanel();
        myButtonPanel.setPreferredSize(new Dimension(200, 200));
        jPanel.add(myButtonPanel);

        add(jPanel);

        pack();
        setVisible(true);
    }
}
