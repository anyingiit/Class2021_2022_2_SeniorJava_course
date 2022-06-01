package JWork_22_6_1;

import java.awt.*;

public class Work6 extends Frame {
    Label b1, b2;
    Panel pan;
    Button bt1, bt2;
    TextField tf1;

    public Work6(String title) {
        setSize(300, 300);
        b1 = new Label("leftLabel", Label.LEFT);
        b1.setBackground(Color.yellow);
        b2 = new Label("rightLabel", Label.RIGHT);
        b2.setBackground(Color.green);
        tf1 = new TextField("宽度为25的文本框", 25);
        bt1 = new Button();
        bt1.setLabel("leftButton");
        bt1.setActionCommand("左");
        Button bt2 = new Button();
        bt2.setLabel("rightButton");
        bt2.setActionCommand("右");
        pan = new Panel();
        pan.add(b1);
        pan.add(b2);
        pan.add(tf1);
        pan.add(bt1);
        pan.add(bt2);
        add(pan);
        setSize(250, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Work6("标签 按钮文本框");
    }
}
