package JWork_22_6_12;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Work8 extends JFrame {
    JPopupMenu jpm;

    public Work8(String title) {
        super(title);
        jpm = new JPopupMenu();
        JMenu jm1 = new JMenu("shape");
        JMenu jm2 = new JMenu("color");
        JMenuItem jmil = new JMenuItem("Rectangle");
        JMenuItem jmi2 = new JMenuItem("Circle");
        jm1.add(jmil);
        jm1.add(jmi2);
        jm2.add(new JMenuItem("Red"));
        jm2.add(new JMenuItem("Yellow"));
        jpm.add(jm1);
        jpm.add(jm2);
        jpm.add(new JMenuItem("Exit"));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
                if (e.getButton() == MouseEvent.BUTTON3) {
                    jpm.show(e.getComponent(), e.getX(), e.getY());
                }
            }
        });

        setSize(300, 300);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Work8("弹出菜单");
    }
}
