package JWork_22_3_25;

import java.util.Date;

public class Work4 {
  public static void main(String[] args){
    Date date = new Date();
    System.out.printf("全部日期和时间信息: %tc%n", date);
    System.out.printf("年-月-日格式: %tF%n", date);
    System.out.printf("月/日/年格式: %tD%n", date);
    System.out.printf("HH:MM:SS PM格式(12时制): %tT%n", date);
    System.out.printf("HH:MM:SS格式 (24时制): %tR%n", date);
    System.out.printf("%1$s %2$tB %2$td, %2$tY", "Due date: ", date);
    System.out.println();
  }
}
