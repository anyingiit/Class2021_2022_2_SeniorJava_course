package JWork_22_4_11;

import javax.swing.*;
import java.awt.*;
import java.awt.Color;

public class Work3 extends JFrame {
    int HEIGHT = 284;
    int WEIGHT = 284;
    Color [] color ={Color.BLUE,Color.black,Color.RED, Color.YELLOW, Color.GREEN};
    int [] x = {150,375,600,262,487};
    int [] y = {150,150,150,300,300};
    public void paint(Graphics g){
        Graphics2D g1 = (Graphics2D)g;
        BasicStroke basicStroke = new BasicStroke(3);
        g1.setStroke(basicStroke);
        for (int i=0;i<5;i++){
            g1.setColor(color[i]);
            g1.drawOval(x[i],y[i],HEIGHT,WEIGHT);
        }
    }

    public Work3() {

        this.setSize(1200, 1000);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        new Work3();
    }
}