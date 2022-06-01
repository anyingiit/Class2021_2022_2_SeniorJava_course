package JWork_22_6_1;

import javax.swing.*;
import java.awt.*;

public class Work3 {

    public static Image getImages(String fileName) {
        Image bi = null;
        try {
            String path = "src/JWork_22_6_1/" + fileName;
            bi = new ImageIcon(path).getImage();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bi;
    }

    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jpanel = new JPanel() {

            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                Image image1 = getImages("Work3_image1.png");
                Image image2 = getImages("Work3_image2.png");
                Image image3 = getImages("Work3_image3.png");
                Image image4 = getImages("Work3_image4.png");
                graphics.drawImage(image1, 0, 0, 500, 500, null);

                graphics.drawImage(image2, 225, 300, 50, 50, null);
                graphics.drawImage(image3, 225, 460, 50, 50, null);
                graphics.drawImage(image2, 290, 300, 50, 50, null);

                graphics.drawImage(image4, 225, -20, 50, 50, null);
            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(520, 530);
        jFrame.setVisible(true);
    }
}