package JWork_22_6_12;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Work7 {
    public static void main(String[] args) {
        PrintStream ps;
        try {
            ps = new PrintStream("E:/test.txt");
            ps.println("胜日寻芳泗水滨");
            ps.println("无边光景一时新");
            ps.println("等闲识得东风面");
            ps.println("万紫千红总是春");
        } catch (FileNotFoundException e) {
            System.out.println(e.toString());
        }
    }
}