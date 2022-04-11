package JWork_22_3_18;

public class Work7 {
  public static void main(String[] args){
    int targetArray[] = {-50, 88, 5};
    int max = targetArray[0];
    for(int i = 1; i < targetArray.length; i++){
      if(targetArray[i] > max) max = targetArray[i];
    }
    System.out.print("数组: ");
    for(int i = 0; i < targetArray.length; i++){
      System.out.print(targetArray[i] + " ");
    }
    System.out.println("经过比较, 最大值为: " + max);
  }
}
