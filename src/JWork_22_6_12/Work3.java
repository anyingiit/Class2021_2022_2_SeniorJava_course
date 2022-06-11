package JWork_22_6_12;

import javax.swing.*;
import java.awt.*;

public class Work3 extends JFrame {
    JLabel[][] jlb;
    JPanel jp;

    public Work3(String title) {
        super(title);
        jp = new JPanel();
        jp.setLayout(new GridLayout(8, 8));
        jlb = new JLabel[8][8];
        for (int i = 0; i < jlb.length; i++) {
            for (int j = 0; j < jlb[i].length; j++) {
                jlb[i][j] = new JLabel((i + 1) + ", " + (j + 1), JLabel.CENTER);
                jlb[i][j].setOpaque(true);
                jlb[i][j].setForeground(Color.red);
                if ((i + j) % 2 == 0) jlb[i][j].setBackground(Color.black);
                else jlb[i][j].setBackground(Color.white);
                jp.add(jlb[i][j]);
            }
        }
        add(jp);
        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }

    public static void main(String[] args) {
        new Work3("网格布局");
    }
}
