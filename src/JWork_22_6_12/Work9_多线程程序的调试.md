一. 简答题（共1题，100分）

1. (简答题) 完成一个多线程程序调试，记录运行结果，见17.3，,1.7.4

睡眠程序

```java
public class sleep extends Thread {

    public void run() {

        for (int i = 0; i < 20; i++) {

            if (i % 10 == 0) {

                System.out.println("-------" + i);
            }

            System.out.print(i);

            try {
                Thread.sleep(1000);

                System.out.print("    线程睡眠1秒！\n");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
    }

    public static void main(String[] args) {
        new sleep().start();

    }
}
```

多进程调度

```java
public class ThreadYieldDemo {

    public static void main(String[] args) {

        System.out.println("当前的线程是" + Thread.currentThread().getName());

        Thread thread1 = new Thread(new YieldThread());

        thread1.start();

        Thread thread2 = new Thread(new YieldThread());

        thread2.start();

    }

}

class YieldThread implements Runnable {
    public void run() {
        for (int i = 0; i < 10; i++) {

            System.out.println(Thread.currentThread().getName() + "运行了" + i + "次");

            if (i == 5) {     //当前正在执行的线程让步给其它线程

                Thread.yield();

            }

        }

    }

}
```

```java
public class isAliveDemo extends Thread {

    public isAliveDemo(String name) {
        super(name);
    }

    public void run() {

        for (int i = 0; i < 5; i++) {

            printMsg();

        }

    }

    public void printMsg() {

        Thread t = Thread.currentThread();//获得当前的线程对象

        String name = t.getName();

        System.out.println("name=" + name);

    }

    public static void main(String[] args) {

        isAliveDemo t = new isAliveDemo("Thread1");

        System.out.println("调用start()方法前,t.isAlive()=" + t.isAlive());

        t.start();

        System.out.println("调用start()方法后,t.isAlive()=" + t.isAlive());

        for (int i = 0; i < 5; i++) {

            t.printMsg();

        }

        //下面语句的输出结果是不固定的，有时为false，有时为true

        System.out.println("main()方法结束时，t.isAlive()=" + t.isAlive());

    }

}
```