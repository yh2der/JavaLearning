import javax.swing.*;

public class Ch17_5 {
    static JFrame frm = new JFrame("Frame 5");
    static ImageIcon ok = new ImageIcon("ok.png");
    static ImageIcon agave = new ImageIcon("agave.png");
    static JLabel label = new JLabel(agave);
    static JButton btn = new JButton("OK");

    public static void main(String[] args) {
        frm.setSize(250, 260);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        label.setBounds(20, 10, 200, 150);
        btn.setIcon(ok);
        btn.setBounds(80, 180, 90, 30);

        frm.setLayout(null);
        frm.add(label);
        frm.add(btn);
        frm.setVisible(true);
    }
}
