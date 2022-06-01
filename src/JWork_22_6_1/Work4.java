package JWork_22_6_1;

public class Work4 {

    public static void main(String[] args) {
        System.out.println("Hello World!!!");

        try {
            System.out.println(1 / 0); //尝试使用0作为除数
        } catch (ArithmeticException e) { //捕获除数为0异常
            System.out.println("除数为0!");
        }

        System.out.println("除数为零后程序没有终止!!!");
    }
}