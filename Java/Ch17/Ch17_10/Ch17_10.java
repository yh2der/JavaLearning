import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ch17_10 {
    static JFrame frm = new JFrame("Frame 10");
    static JButton btnK = new JButton("kitty");
    static JButton btnP = new JButton("puppy");
    static ImageIcon kittyIcon = new ImageIcon("kittyicon.png");
    static ImageIcon puppyIcon = new ImageIcon("puppyicon.png");
    static ImageIcon kitty = new ImageIcon("kitty.png");
    static ImageIcon puppy = new ImageIcon("puppy.png");
    static JLabel label = new JLabel();
    public static void main(String[] args) {
        frm.setSize(500, 500);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        btnK.setIcon(kittyIcon);
        btnP.setIcon(puppyIcon);
        
        btnK.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(kitty);
            }
        });

        btnP.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setIcon(puppy);
            }
        });
        
        frm.add(btnK);
        frm.add(btnP);
        frm.add(label);
        frm.setVisible(true);
    }
}