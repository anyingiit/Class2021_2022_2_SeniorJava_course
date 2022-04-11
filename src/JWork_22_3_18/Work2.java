package JWork_22_3_18;

import java.util.Scanner;

public class Work2 {
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int score = sin.nextInt();
    sin.close();
    if (score >= 85) {
      System.out.println("优");
    } else if (score >= 70) {
      System.out.println("良");
    } else if (score >= 60) {
      System.out.println("及格");
    } else {
      System.out.println("不及格");
    }
  }
}
