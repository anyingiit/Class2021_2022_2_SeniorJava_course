package JWork_22_6_1;

import java.awt.*;

public class Work1 extends Frame {
    Panel panBig, panSmall;

    public Work1(String title) {
        super(title);
        setSize(300, 300);
        setBackground(Color.red);
        setLayout(null);
        panBig = new Panel();
        panSmall = new Panel();

        panBig.setSize(200, 200);
        panBig.setBackground(Color.green);
        panBig.setLayout(null);

        panSmall.setSize(100, 100);
        panSmall.setBackground(Color.blue);

        panBig.add(panSmall);

        add(panBig);

        setVisible(true);
    }

    public static void main(String[] args) {
        new Work1("Panel面板展示");
    }
}
