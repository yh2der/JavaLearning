import javax.swing.*;
import java.awt.*;

public class Ch17_5 {
    static JFrame frm = new JFrame("Frame 5");
    static ImageIcon ok = new ImageIcon("ok.png");
    static ImageIcon agave = new ImageIcon("agave.png");
    static JLabel label = new JLabel(agave);
    static JButton btn = new JButton("OK");
    btn.setIcon(ok);

    public static void main(String[] args) {
        frm.setSize(250, 260); 
        // label.setBounds(20, 10, 200, 150); 
        //btn.setBounds(80, 180, 90, 30);

        frm.setLayout(new FlowLayout());
        frm.add(label);
        frm.add(btn);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
