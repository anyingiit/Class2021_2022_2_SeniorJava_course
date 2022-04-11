package JWork_22_4_11;

import java.util.Scanner;

public class Work2 {
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    System.out.print("即将开始智力问答, 请你看到题目后30秒后回答选项A B C 或者D其中一项, 并且按回车提交答案, 请按回车查看题目并答题: ");
    sin.nextLine();
    System.out.println("法学院的女生比男生多，在下学期的数学期末考试中，法学院不及格的学生超过了一半。由此可见：");
    System.out.println("A. 女生不及格的比男生不及格的多");
    System.out.println("B. 女生不及格的比男生及格的多");
    System.out.println("C. 女生及格的比男生不及格的多");
    System.out.println("D. 女生及格的比男生及格的多");
    try {
      Thread.sleep(1000*30);// 休眠30秒
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.print("请输入答案: ");
    String input = sin.nextLine();
    if (input.equals("B")) {
      System.out.println("回答正确");
    } else {
      System.out.println("回答错误");
    }
    System.out.println("答题结束");
    sin.close();
  }
}
