package JWork_22_6_12;

import javax.swing.*;
import java.awt.*;

public class Work2 extends JFrame {

    public Work2() {
        super("边界布局");
        add(new JButton("北"), BorderLayout.NORTH);
        add(new JButton("南"), BorderLayout.SOUTH);
        add(new JButton("西"), BorderLayout.WEST);
        add(new JButton("东"), BorderLayout.EAST);
        add(new JButton("中"), BorderLayout.CENTER);

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        validate();
    }

    public static void main(String[] args) {
        new Work2();
    }
}
