import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch17_12 extends JFrame implements ActionListener {
    static Ch17_12 frm = new Ch17_12();
    static JRadioButton rbtnKitty = new JRadioButton("kitty");
    static JRadioButton rbtnPuppy = new JRadioButton("puppy");
    static JRadioButton rbtnAgave = new JRadioButton("agave");
    static ImageIcon picKitty = new ImageIcon("kitty.png");
    static ImageIcon picPuppy = new ImageIcon("puppy.png");
    static ImageIcon picAgave = new ImageIcon("agave.png");
    static JLabel lab = new JLabel();

    public static void main(String[] args) {
        ButtonGroup buttonGroup = new ButtonGroup();
        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        
        buttonGroup.add(rbtnKitty);
        buttonGroup.add(rbtnPuppy);
        buttonGroup.add(rbtnAgave);

        frm.setTitle("Image Selector");
        frm.setSize(400, 300);
        frm.setLayout(new BorderLayout());        
        
        radioPanel.add(rbtnKitty);
        radioPanel.add(rbtnPuppy);
        radioPanel.add(rbtnAgave);
        imagePanel.add(lab);

        rbtnKitty.addActionListener(frm);
        rbtnPuppy.addActionListener(frm);
        rbtnAgave.addActionListener(frm);

        frm.add(radioPanel, BorderLayout.NORTH);           
        frm.add(imagePanel, BorderLayout.CENTER);

        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        JRadioButton rbtn = (JRadioButton) e.getSource();
        if (rbtn == rbtnKitty)
            lab.setIcon(picKitty);
        else if (rbtn == rbtnPuppy)
            lab.setIcon(picPuppy);
        else if (rbtn == rbtnAgave)
            lab.setIcon(picAgave);
    }
}
