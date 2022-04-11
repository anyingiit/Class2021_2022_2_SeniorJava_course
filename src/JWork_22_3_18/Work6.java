package JWork_22_3_18;

public class Work6 {
  public static int factorial(int x){
    if(x == 1) return 1;
    return x * factorial(x - 1);
  }
  public static void main(String[] args){
    System.out.println(factorial(5));
  }
}
