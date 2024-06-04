import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;

public class Ch17_13 {
    public static void main(String[] args) {
        JFrame frame = new JFrame("ScrollBar Example");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel(new BorderLayout()); // Use BorderLayout
        JLabel label = new JLabel("Scrollbars at (0, 0)");
        panel.add(label, BorderLayout.NORTH); // Add label to the NORTH
        
        // 水平捲軸// 垂直捲軸
        JScrollBar horizontalScrollBar = new JScrollBar(JScrollBar.HORIZONTAL, 0, 10, 0, 100);
        JScrollBar verticalScrollBar = new JScrollBar(JScrollBar.VERTICAL, 0, 10, 0, 100);
        horizontalScrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                updateLabelText(label, horizontalScrollBar, verticalScrollBar);
            }
        });
        panel.add(horizontalScrollBar, BorderLayout.SOUTH); // Add horizontalScrollBar to the SOUTH
        
        
        
        verticalScrollBar.addAdjustmentListener(new AdjustmentListener() {
            public void adjustmentValueChanged(AdjustmentEvent e) {
                updateLabelText(label, horizontalScrollBar, verticalScrollBar);
            }
        });
        panel.add(verticalScrollBar, BorderLayout.EAST); // Add verticalScrollBar to the EAST
        
        frame.add(panel);
        frame.setSize(400, 200);
        frame.setVisible(true);
    }
    
    private static void updateLabelText(JLabel label, JScrollBar horizontalScrollBar, JScrollBar verticalScrollBar) {
        String text = "Scrollbars at (" + horizontalScrollBar.getValue() +
                      ", " + verticalScrollBar.getValue() + ")";
        label.setText(text);
    }
}
