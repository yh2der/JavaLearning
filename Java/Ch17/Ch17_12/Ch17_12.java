import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch17_12 {
    static JFrame frm = new JFrame("Image Selector");
    static JRadioButton rbtnKitty = new JRadioButton("kitty");
    static JRadioButton rbtnPuppy = new JRadioButton("puppy");
    static JRadioButton rbtnAgave = new JRadioButton("agave");
    static ImageIcon picKitty = new ImageIcon("kitty.png");
    static ImageIcon picPuppy = new ImageIcon("puppy.png");
    static ImageIcon picAgave = new ImageIcon("agave.png");
    static JLabel lab = new JLabel();

    public static void main(String[] args) {
        frm.setSize(400, 300);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new BorderLayout());

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rbtnKitty);
        buttonGroup.add(rbtnPuppy);
        buttonGroup.add(rbtnAgave);

        rbtnKitty.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setIcon(picKitty);
            }
        });

        rbtnPuppy.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setIcon(picPuppy);
            }
        });

        rbtnAgave.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                lab.setIcon(picAgave);
            }
        });

        rbtnKitty.setSelected(true);

        JPanel radioPanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 使用流式布局，并居中

        radioPanel.add(rbtnKitty);
        radioPanel.add(rbtnPuppy);
        radioPanel.add(rbtnAgave);

        frm.add(radioPanel, BorderLayout.NORTH);

        JPanel imagePanel = new JPanel(new FlowLayout(FlowLayout.CENTER)); // 使用流式布局，并居中
        imagePanel.add(lab);

        frm.add(imagePanel, BorderLayout.CENTER);

        frm.setVisible(true);
    }
}
