import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ch17_11 extends JFrame implements ActionListener {
    static Ch17_11 frm = new Ch17_11();
    static JButton btnRed = new JButton("red");
    static JButton btnGreen = new JButton("green");
    static ImageIcon picRed = new ImageIcon("red.gif");
    static ImageIcon picGreen = new ImageIcon("green.gif");
    static JLabel lab = new JLabel("Make hay while the sun shines");

    public static void main(String[] args) {
        frm.setTitle("JButton & JLabel");
        frm.setSize(300, 120);        
        frm.setLayout(new FlowLayout());
        frm.getContentPane().setBackground(Color.ORANGE);
        btnRed.setIcon(picRed);
        btnGreen.setIcon(picGreen);
        btnRed.addActionListener(frm);
        btnGreen.addActionListener(frm);

        frm.add(btnRed);
        frm.add(btnGreen);
        frm.add(lab);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);        
    }

    public void actionPerformed(ActionEvent e) {
        JButton btn = (JButton) e.getSource();
        if (btn == btnRed) {
            lab.setForeground(Color.RED);
        }
        else if (btn == btnGreen) {
            lab.setForeground(Color.GREEN);
        }
    }
}