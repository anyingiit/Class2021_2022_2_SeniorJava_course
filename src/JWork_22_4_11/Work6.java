package JWork_22_4_11;

import javax.swing.*;
import java.awt.*;

public class Work6 {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JPanel jpanel = new JPanel() {

            @Override
            public void paint(Graphics graphics) {
                super.paint(graphics);
                Rectangle rectangleBig = new Rectangle(3, 3);
                Rectangle rectangleSmall = new Rectangle(1, 1);
                graphics.drawRect(500, 500, rectangleBig.width * 100, rectangleBig.height * 100);
                graphics.drawRect(600, 600, rectangleSmall.width * 100, rectangleSmall.height * 100);
                graphics.drawString("大矩形的周长为: " + Integer.toString(rectangleBig.getPerimeter()) + " 面积为: " + Integer.toString(rectangleBig.getArea()), 500, 820);
                graphics.drawString("小矩形的周长为: " + Integer.toString(rectangleSmall.getPerimeter()) + " 面积为: " + Integer.toString(rectangleSmall.getArea()), 500, 840);
            }
        };
        jFrame.add(jpanel);
        jFrame.setSize(300, 300);
        jFrame.setVisible(true);
    }
}


class Rectangle{
    int width, height;
    Rectangle(int width, int height){
        this.width = width;
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    int getPerimeter(){
        return  (width + height) * 2;
    }

    int getArea(){
        return width * height;
    }
}