package JWork_22_3_18;

public class Work4 {
  public static void main(String[] args){
    StringBuffer s1 = new StringBuffer();
    s1.append("Hello Java!");
    System.out.println(s1);
    System.out.println(s1.length());
    System.out.println(s1.capacity());// 容量会随着使用自动增长
    s1.replace(6, 10, "StringBuffer");// 将坐标6~10位置的字符替换为StringBuffer
    System.out.println(s1);
    System.out.println(s1.length());
    System.out.println(s1.capacity());
    s1.setCharAt(12, 'b');
    System.out.println(s1);
    s1.insert(6, "String and ");
    System.out.println(s1);
    s1.deleteCharAt(s1.length()-1);// 删除最后一个字符
    System.out.println(s1);
  }
}
