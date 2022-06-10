package JWork_22_6_11;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;


public class Work2 extends JFrame {
    JPanel jp;
    JButton jb1, jb2;

    public Work2() {

        super("ActionEvent 处理");

        jp = new JPanel();

        jb1 = new JButton("红色背景");

        AbstractAction abstractAction = new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (e.getActionCommand().equals("红色背景")) {
                    jp.setBackground(Color.red);
                    setTitle("红色");
                } else if (e.getActionCommand().equals("黄色背景")) {
                    jp.setBackground(Color.yellow);
                    setTitle("黄色");
                }
            }
        };

        jb1.addActionListener(abstractAction);

        jb2 = new JButton("黄色背景");

        jb2.addActionListener(abstractAction);

        jp.add(jb1);

        jp.add(jb2);

        add(jp);

        setSize(300, 150);

        setVisible(true);

    }

    public static void main(String[] args) {
        new Work2();
    }
}
