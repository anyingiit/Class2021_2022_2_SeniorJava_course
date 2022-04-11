package JWork_22_4_11;


import java.util.Scanner;

public class Work1 {
    public static void main(String[] args) {
        int i;
        int x = 0,y=0,id=0;   //x为注册的用户名   y为注册的密码   id为随机生成的会员卡号
        char cha;
        boolean yn=false;   //yn 为注册标识
        boolean ok=false;   //ok用于判断登录的账号密码是否和注册信息匹配
        boolean rea=false;    //rea用于判断用户是否正常登录
        

        int Iid;            //Iid为用户输入的会员卡号
        int aa=0,bb=0,cc=0,dd=0,ee=0; //这五个数为5个幸运数字
        int m,n;            //m为登录的用户名  n为登录密码
        Scanner input=new Scanner(System.in);
        do {
            System.out.println("*****欢迎进入奖客富翁系统*****");
            System.out.println("        1.注册");
            System.out.println("        2.登录");
            System.out.println("        3.抽奖");
            System.out.println("******************************");
            System.out.println("请选择菜单：");
            i=input.nextInt();
            if(i==1) {
                System.out.println("[奖客富翁系统>注册]");
                System.out.println("请填写个人注册信息：");
                System.out.println("用户名：");
                x=input.nextInt();
                System.out.println("密码：");
                y=input.nextInt();
                id = (int)(Math.random()*(9999-1000))+1000;
                
                System.out.println("注册成功，请记好您的会员卡号");
              

                System.out.println("用户名\t密码\t会员卡号");
                System.out.println(x+"\t"+y+"\t"+id);
                yn=true;
            }
            else if(i==2) {
                System.out.println("[奖客富翁系统>登录]");
                for(int a=1;a<=3;a++) {
                    System.out.println("请输入用户名：");
                    m=input.nextInt();
                    System.out.println("请输入密码：");
                    n=input.nextInt();
                    if(m==x&&n==y) {
                        ok=true;
                        break;
                    }
                    else if(a!=3)
                        System.out.println("用户名和密码不匹配，请重新输入！");
                    else;
                }
                if(ok==true) {
                    System.out.println("欢迎您"+x);
                    rea=true;
                }
                else 
                    System.out.println("你已经累计3次错误登录请联系客服");
            }
            else if(i==3) {
                System.out.println("[奖客富翁系统>抽奖]");
                if(rea==true) {
                    System.out.println("请输入您的卡号：");
                    Iid=input.nextInt();
                    if(Iid!=id)
                        System.out.println("您输入的会员卡号有误，请核对后输入！");
                    else {
                        aa=(int)(Math.random()*(9999-1000))+1000;
                        bb=(int)(Math.random()*(9999-1000))+1000;
                        cc=(int)(Math.random()*(9999-1000))+1000;
                        dd=(int)(Math.random()*(9999-1000))+1000;
                        ee=(int)(Math.random()*(9999-1000))+1000;
                        System.out.println("本日幸运数字为"+aa+"\t"+bb+"\t"+cc+"\t"+dd+"\t"+ee);

                        if (checkIsLuckMember(Iid, aa) || checkIsLuckMember(Iid, bb) || checkIsLuckMember(Iid, cc) || checkIsLuckMember(Iid, dd) || checkIsLuckMember(Iid, ee)){
                          System.out.println("恭喜您成为本日的幸运会员");
                        }
                        else{
                          System.out.println("抱歉！您不是本日的幸运会员");    
                        }
                        System.out.println("系统推出谢谢使用(*^▽^*)");
                    }
                }
                else
                    System.out.println("请先进行登录");
            }
            else{
              System.out.println("您的输入有误！");
            }

            System.out.println("继续吗(Y/y)");
            cha=input.next().charAt(0);
            }while(cha=='y'||cha=='Y');
        System.out.println("系统推出，谢谢使用！");        
    }

    private static boolean checkIsLuckMember(int id, int luckNumber){
      if(Integer.toString(id).equals(Integer.toString(luckNumber))){
        return true;
      }
      return false;
    }
}