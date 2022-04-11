package JWork_22_4_11;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.net.URL;


public class Work5 {

    public static Image getImages(String fileName){
        Image bi = null;
        try {
            String path = "src/JWork_22_4_11/" + fileName;
//            System.out.println("path: " + path);
            bi = new ImageIcon(path).getImage();
        }catch(Exception e){
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
                Image image1 = getImages("Work5_image1.jpg");
                Image image2 = getImages("Work5_image2.jpg");
                Image image3 = getImages("Work5_image3.jpg");
                graphics.drawImage(image1, 0, 0, 100, 100, null);
                graphics.drawString("小埋", 100, 10);

                graphics.drawImage(image2, 150, 0,100, 100, null);
                graphics.drawString("小猫", 250, 10);

                graphics.drawImage(image3, 360, 0, 100, 100,null);
                graphics.drawString("小狗", 460, 10);
            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}
