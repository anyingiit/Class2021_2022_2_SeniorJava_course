package JWork_22_3_25;

import java.util.Calendar;

public class Work3 {
  public static void main(String[] args){
    Calendar calendar = Calendar.getInstance();
    calendar.set(Calendar.YEAR, 1976);
    calendar.set(Calendar.MONTH, 1);
    calendar.set(Calendar.DATE, 28);
    System.out.println(calendar.getTime());
  }
}
