import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class Ch17_11 {
    static JFrame frm = new JFrame("JButton & JLabel");
    static JButton btnRed = new JButton("red");
    static JButton btnGreen = new JButton("green");
    static ImageIcon picRed = new ImageIcon("red.gif");
    static ImageIcon picGreen = new ImageIcon("green.gif");
    static JLabel lab = new JLabel("Make hay while the sun shines");
    public static void main(String[] args) {
        frm.setSize(300, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new FlowLayout());
        frm.getContentPane().setBackground(Color.ORANGE);
        btnRed.setIcon(picRed);
        btnGreen.setIcon(picGreen);
        btnRed.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setForeground(Color.RED); // 将标签文字颜色设置为红色
            }
        });

        btnGreen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setForeground(Color.GREEN); // 将标签文字颜色设置为绿色
            }
        });
        frm.add(btnRed);
        frm.add(btnGreen);
        frm.add(lab);
        frm.setVisible(true);
    }
}