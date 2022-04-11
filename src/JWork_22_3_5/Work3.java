package JWork_22_3_5;

import java.util.Scanner;

public class Work3 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    System.out.print("请输入两个整数: ");
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    scanner.close();
    if(y >= x) {
      x = y;
      System.out.println(x + "更大");
    }
  }
}
