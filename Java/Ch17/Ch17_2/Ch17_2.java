import javax.swing.*;
import java.awt.*;

public class Ch17_2 {
    public static void main(String[] args) {
        JFrame frm = new JFrame("My Frame");
        frm.setSize(250, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(null); // 使用null佈局，手動設置組件位置和大小
        frm.getContentPane().setBackground(Color.PINK);

        JLabel lab = new JLabel("Knowledge is power.");
        lab.setSize(160, 20);
        lab.setLocation(40, 0);
        // lab.setBounds(40, 10, 160, 20);
        lab.setBackground(Color.PINK);
        lab.setForeground(Color.BLUE); 
        lab.setFont(new Font("Arial", Font.PLAIN, 14)); 
        frm.add(lab);
        frm.setVisible(true);
    }
}
