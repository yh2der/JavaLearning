import javax.swing.*;
import java.awt.*;

public class Ch17_2 {
    public static void main(String[] args) {
        JFrame frm = new JFrame("My Frame");
        JPanel pne = new JPanel();
        JLabel lab = new JLabel("Knowledge is power.");

        frm.setSize(250, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        lab.setSize(160, 20);
        lab.setLocation(40, 0);
        lab.setForeground(Color.BLUE); 
        lab.setFont(new Font("Arial", Font.PLAIN, 14));

        pne.setBackground(Color.PINK);
        pne.add(lab);         

        frm.add(pne);
        frm.setVisible(true);
    }
}
