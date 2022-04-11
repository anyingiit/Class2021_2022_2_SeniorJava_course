package JWork_22_3_18;

import java.util.Scanner;

public class Work1 {
  public static void main(String[] args){
    Scanner sin = new Scanner(System.in);
    int height = sin.nextInt();
    sin.close();
    
    int top = height % 2 == 0? height / 2 - 1 : height / 2;
    int bottom = height % 2 == 0? height / 2 - 1 : height / 2;
    int middle = height - (top + bottom);

    for(int i = 1; i <= top; i++){
      for(int j = 0; j < top - i + 1; j++){
        System.out.print(" ");
      }
      for(int j = 0; j < i * 2 - 1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = 1; i <= middle; i++){
      for(int j = 0; j < (top + 1) * 2 - 1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

    for(int i = bottom; i > 0; i--){
      for(int j = 0; j < bottom - i + 1; j++){
        System.out.print(" ");
      }
      for(int j = 0; j < i * 2 - 1; j++){
        System.out.print("*");
      }
      System.out.println();
    }

  }
}
