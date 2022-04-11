package JWork_22_3_25;

import java.util.Date;

public class Work2 {
  public static void main(String[] args){
    System.out.println(new Date( ) + "\n");
    try {
      Thread.sleep(1000*3);// 休眠3秒
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    System.out.println(new Date( ) + "\n");
  }
}
