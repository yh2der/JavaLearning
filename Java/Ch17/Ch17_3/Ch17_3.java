import javax.swing.*;
import java.awt.*;

public class Ch17_3 {
    public static void main(String[] args) {
        JFrame frm = new JFrame("Frame 3");
        JButton btn = new JButton("Push Me!!");
        frm.setSize(250, 120);  
        
        // 用這個就不用特別設組件位置
        // 要設詳細位置跟大小的話 layout設成NULL 並且用btn.setBounds(int x, int y, int width, int height)
        //                                                      x: 组件左上角的 x 坐标（相对于其父容器）
        //                                                      y: 组件左上角的 y 坐标（相对于其父容器）。
        //                                                      width: 组件的宽度。
        //                                                      height: 组件的高度。     
        frm.setLayout(new FlowLayout()); 
        
        // 改大小的 
        //btn.setPreferredSize(new Dimension(150, 40));
        frm.add(btn);
        frm.setVisible(true);
        frm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
