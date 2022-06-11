package JWork_22_6_12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class Work1 extends JFrame {

    JLabel jlb;

    JTextField jtf;

    public Work1(String title) {

        super(title);

        jlb = new JLabel("请按下鼠标左键并拖拽");

        jtf = new JTextField();

        Container ct = getContentPane();

        ct.add(jlb, "North");

        ct.add(jtf, "South");

        MouseHandler mh = new MouseHandler();

        mh.setDisplay(jtf);

        addMouseListener(mh);

        addMouseMotionListener(mh);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setSize(350, 200);

        setVisible(true);
    }

    public static void main(String[] args) {

        new Work1("MouseEvent 事件处理");

    }

}

class MouseHandler implements MouseListener, MouseMotionListener {

    JTextField display;

    public void setDisplay(JTextField display) {

        this.display = display;
    }

    public void mouseClicked(MouseEvent e) {

        if (e.getClickCount() == 1) {
            display.setText("单击鼠标");
        } else if (e.getClickCount() >= 2) {
            display.setText("连击鼠标");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {

    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}