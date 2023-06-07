import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyButtonPanel extends JPanel {

    public MyButtonPanel() {
        setBackground(new Color(100, 60, 140));

        JTextField textField = new JTextField();
        textField.setText("Hej");
        textField.setPreferredSize(new Dimension(100, 20));
        add(textField);

        JButton myFirstButton = new JButton("Przycisnij mnie");

        myFirstButton.setEnabled(true);
        myFirstButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Nacisnieto przycisk");
            }
        });
        myFirstButton.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (MouseEvent.BUTTON1 == e.getButton()) {
                    System.out.println("LEWY");
                } else if (MouseEvent.BUTTON2 == e.getButton()) {
                    System.out.println("SRODKOWY");
                } else if (MouseEvent.BUTTON3 == e.getButton()) {
                    System.out.println("PRAWY");

                    String text = textField.getText();
                    textField.setText(text + "zakaz");

                    JButton jButton = new JButton("dosc");
                    add(jButton);
                    revalidate();
                }
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        add(myFirstButton);
    }
}
