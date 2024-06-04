import javax.swing.*;

public class Ch17_3 {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Frame 3");
        frm.setSize(250, 120);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton btn = new JButton("Push Me!!");
        btn.setBounds(75, 5, 100, 30);
        frm.add(btn);

        frm.setLayout(null); 
        frm.setVisible(true);
    }
}
