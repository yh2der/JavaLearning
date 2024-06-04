import javax.swing.*;
import java.awt.*;

public class Ch17_7 {
    static JFrame frm = new JFrame("Frame 7");
    static JLabel lab = new JLabel("Honesty is the best policy");
    static JButton btn1 = new JButton("OK");
    static JButton btn2 = new JButton("Exit");
    public static void main(String[] args) {
        frm.setSize(230, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        lab.setOpaque(true);
        lab.setBackground(Color.ORANGE);
        frm.add(lab);
        frm.add(btn1);
        frm.add(btn2);
        frm.setVisible(true);
    }
}
