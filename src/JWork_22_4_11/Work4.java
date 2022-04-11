package JWork_22_4_11;

import javax.swing.*;
import java.awt.*;

public class Work4 {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jpanel = new JPanel() {

            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                graphics.drawOval(100, 70, 30, 30);// 头部（画圆形）
                graphics.drawRect(105, 100, 20, 30);// 身体（画矩形）
                graphics.drawLine(105, 100, 75, 120);// 左臂（画直线）
                graphics.drawLine(125, 100, 150, 120);// 右臂（画直线）
                graphics.drawLine(105, 130, 75, 150);// 左腿（画直线）
                graphics.drawLine(125, 130, 150, 150);// 右腿（画直线）
            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
