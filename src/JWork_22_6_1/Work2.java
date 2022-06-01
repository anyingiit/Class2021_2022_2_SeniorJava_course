package JWork_22_6_1;

import javax.swing.*;
import java.awt.*;


public class Work2 {

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
                Image image1 = getImages("Work2_image1.jpg");
                Image image2 = getImages("Work2_image2.png");
                Image image3 = getImages("Work2_image3.png");
                graphics.drawImage(image1, 0, 0, 500, 500, null);

                graphics.drawImage(image2, 238, 238, 25, 25, null);
                graphics.drawImage(image3, 238, 290, 25, 25, null);
                graphics.drawImage(image2, 290, 238, 25, 25, null);
            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(520, 530);
        jFrame.setVisible(true);
    }
}
