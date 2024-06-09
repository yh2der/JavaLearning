import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch17_10 extends JFrame implements ActionListener {
    static Ch17_10 frm = new Ch17_10();
    static JButton btnK = new JButton("kitty");
    static JButton btnP = new JButton("puppy");
    static ImageIcon kittyIcon = new ImageIcon("kittyicon.png");
    static ImageIcon puppyIcon = new ImageIcon("puppyicon.png");
    static ImageIcon kitty = new ImageIcon("kitty.png");
    static ImageIcon puppy = new ImageIcon("puppy.png");
    static JLabel label = new JLabel();

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn == btnK) {
            label.setIcon(kitty);
        } else if (btn == btnP) {
            label.setIcon(puppy);
        }
    }

    public static void main(String[] args) {
        frm.setTitle("JButton & JLabel");
        frm.setSize(500, 500);        
        frm.setLayout(new FlowLayout());

        btnK.setIcon(kittyIcon);
        btnP.setIcon(puppyIcon);
        
        btnK.addActionListener(frm);
        btnP.addActionListener(frm);
        
        frm.add(btnK);
        frm.add(btnP);
        frm.add(label);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}