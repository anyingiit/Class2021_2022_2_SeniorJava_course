package JWork_22_6_11;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Work1 extends JFrame {
    JLabel jLabel;

    public Work1() {
        super("Keyboard Event");

        jLabel = new JLabel("未按下任何按键", JLabel.CENTER);

        add(jLabel);
        setSize(300, 150);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                jLabel.setText("键入");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                jLabel.setText("抬起");
            }

            @Override
            public void keyReleased(KeyEvent e) {
                jLabel.setText("释放");
            }
        });
    }

    public static void main(String[] args) {
        new Work1();
    }
}
