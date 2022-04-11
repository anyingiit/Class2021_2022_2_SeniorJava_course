package JWork_22_3_18;

import java.util.Scanner;

public class Work3 {
  public static void main(String[] args){
    float sum = 0;
    int score[];
    score = new int[5];
    System.out.println("请输入5名同学的成绩: ");
    Scanner sin = new Scanner(System.in);
    for(int i = 0; i < 5; i++){
      score[i] = sin.nextInt();
      System.out.println("第" + (i + 1) + "名同学的成绩是: " + score[i]);
      sum += score[i];
    }
    sin.close();
    sum /= 5;
    System.out.println("平均成绩是: " + sum);
  }
}
