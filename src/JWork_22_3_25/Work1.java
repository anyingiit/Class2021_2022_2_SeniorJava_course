package JWork_22_3_25;

public class Work1 {
  public static void main(String[] args){
    boolean flag;
    for(int i = 2; i <= 100; i++){
      flag = true;
      for(int j = 2; j < i; j++){
        if(i % j == 0){
          flag = false;
        }
      }
      if(flag){
        System.out.println(i + "是素数");
      }
    }
  }
}
