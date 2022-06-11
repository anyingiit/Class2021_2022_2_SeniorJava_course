package JWork_22_6_12;

import javax.swing.*;
import java.awt.*;

public class Work6 extends JFrame {
    public Work6(String title) {
        super(title);
        JPanelSub jp = new JPanelSub();
        add(jp);
        setSize(280, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Work6("Graphics演示");
    }

    class JPanelSub extends JPanel {
        public void paint(Graphics g) {
            super.paint(g);
            g.drawOval(100, 35, 25, 35);
            g.drawRect(92, 70, 40, 50);
            g.drawLine(92, 70, 75, 100);
            g.drawLine(75, 100, 85, 120);
            g.drawLine(132, 70, 180, 100);
            g.drawLine(100, 115, 75, 150);
            g.drawLine(125, 115, 150, 150);
        }
    }
}