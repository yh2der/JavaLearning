import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ch17_13 extends JFrame implements AdjustmentListener {
    static Ch17_13 frame = new Ch17_13();
    static JPanel panel = new JPanel(new BorderLayout()); // Use BorderLayout
    static JLabel label = new JLabel("Scrollbars at (0, 0)");
    static JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
    static JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100);

    public static void main(String[] args) {       
        frame.setTitle("ScrollBar Example");   
        frame.setSize(400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
        
        panel.add(label, BorderLayout.CENTER);
        panel.add(horizontalScrollBar, BorderLayout.SOUTH);
        panel.add(verticalScrollBar, BorderLayout.EAST);       

        horizontalScrollBar.addAdjustmentListener(frame);
        verticalScrollBar.addAdjustmentListener(frame);
                
        frame.add(panel); 
    }
    
    public void adjustmentValueChanged(AdjustmentEvent e) {
        String text = "Scrollbars at (" + horizontalScrollBar.getValue() +
                      ", " + verticalScrollBar.getValue() + ")";
        label.setText(text);
    }

    private static void updateLabelText(JLabel label, JScrollBar horizontalScrollBar, JScrollBar verticalScrollBar) {
        String text = "Scrollbars at (" + horizontalScrollBar.getValue() +
                      ", " + verticalScrollBar.getValue() + ")";
        label.setText(text);
    }
}
