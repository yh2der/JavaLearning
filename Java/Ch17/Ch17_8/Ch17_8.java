import javax.swing.*;
import java.awt.*;
public class Ch17_8 {
    static JFrame frm = new JFrame("Frame 8");
    static JButton btn1 = new JButton("Button1");
    static JButton btn2 = new JButton("Button2");
    static JButton btn3 = new JButton("Button3");
    
    public static void main(String[] args) {
        frm.setSize(120, 150);        
        frm.setLayout(new FlowLayout());

        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);

        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}