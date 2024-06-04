import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Ch17_14 {
    static JFrame frm = new JFrame("Frame 14");
    static JRadioButton btn1 = new JRadioButton("絕對值");
    static JRadioButton btn2 = new JRadioButton("平方值");
    static JRadioButton btn3 = new JRadioButton("立方值");
    static JTextField textField = new JTextField(10);
    static JButton calculateButton = new JButton("Calculate");
    static JLabel resultLabel = new JLabel("");

    public static void main(String[] args) {
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

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        frm.setLayout(new BorderLayout());
        frm.add(panel, BorderLayout.NORTH);
        frm.add(inputPanel, BorderLayout.CENTER);
        frm.add(resultPanel, BorderLayout.SOUTH);

        frm.setSize(300, 150);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frm.setVisible(true);
    }

    private static void calculate() {
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
