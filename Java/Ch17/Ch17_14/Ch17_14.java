import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Ch17_14 extends JFrame implements ActionListener {
    static Ch17_14 frm = new Ch17_14();
    static JRadioButton btn1 = new JRadioButton("絕對值");
    static JRadioButton btn2 = new JRadioButton("平方值");
    static JRadioButton btn3 = new JRadioButton("立方值");
    static JTextField textField = new JTextField(10);
    static JButton calculateButton = new JButton("Calculate");
    static JLabel resultLabel = new JLabel("");

    public static void main(String[] args) {
        frm.setTitle("Frame 14");
        frm.setSize(300, 150);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setLayout(new BorderLayout());

        // 一次只勾選一個 所以加進group
        ButtonGroup group = new ButtonGroup();
        group.add(btn1);
        group.add(btn2);
        group.add(btn3);

        JPanel panel = new JPanel(new FlowLayout());
        panel.add(btn1);
        panel.add(btn2);
        panel.add(btn3);

        JPanel inputPanel = new JPanel(new FlowLayout());
        inputPanel.add(new JLabel("X :"));
        inputPanel.add(textField);
        inputPanel.add(calculateButton);

        JPanel resultPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        resultPanel.add(resultLabel);

        frm.add(panel, BorderLayout.NORTH);
        frm.add(inputPanel, BorderLayout.CENTER);
        frm.add(resultPanel, BorderLayout.SOUTH);

        calculateButton.addActionListener(frm);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String inputText = textField.getText();
        if (!inputText.isEmpty()) {
            try {
                int x = Integer.parseInt(inputText);
                int result = 0;
                String resultText = "";
                if (btn1.isSelected()) {
                    result = Math.abs(x);
                    resultText = "abs(x) = " + result;
                } else if (btn2.isSelected()) {
                    result = x * x;
                    resultText = "x^2 = " + result;
                } else if (btn3.isSelected()) {
                    result = x * x * x;
                    resultText = "x^3 = " + result;
                }
                resultLabel.setText("Result: " + resultText);
            } catch (NumberFormatException ex) {
                resultLabel.setText("Invalid input! Please enter a valid integer.");
            }
        } else {
            resultLabel.setText("Please enter a number.");
        }
    }        
}
