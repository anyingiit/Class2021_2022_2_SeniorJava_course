package JWork_22_6_1;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class Work5 {
    public static void main(String[] args) {
        File file;
        FileInputStream fis;
        BufferedInputStream bis;
        byte[] b;

        String basePath = "src/JWork_22_6_1/";
        try {
            file = new File(basePath + "Work5Test.txt");
            fis = new FileInputStream(file);
            bis = new BufferedInputStream(fis);

            b = new byte[1024];

            if (bis.read(b) != -1) {
                System.out.println(new String(b));
            } else {
                System.out.println("输入流中无字节可读");// 文件为空
                bis.close();
                fis.close();
            }

        } catch (IOException e) {// IO异常
            System.out.println(e.toString());
        }
    }
}
