一. 简答题（共1题，100分）

1. (简答题)
   以屈原（或其他名人）简介为内容设计一个窗体，上交窗体截图

参考程序如下：

import javax.swing.*;

import java.awt.*;

public class person extends JFrame {

JLabel jlb1,jlb2,jlb3,jlb4,jlb5;

String labels1[]= {"阅读","锻炼","外出旅行","绘画","修身养性"};

String labels2[]= {"中国","美国","日本","英国","法国"};

public person() {

super("整合演示");

this.setResizable(false);

this.setLocationRelativeTo(null);

Icon ic1=new ImageIcon("D:/yy/zgl1.jpg");

jlb1=new JLabel("头像");

jlb2=new JLabel(ic1);

jlb3=new JLabel("性别");

jlb4=new JLabel("兴趣爱好");

jlb5=new JLabel("国籍");

JRadioButton jrb1 = new JRadioButton("男");

JRadioButton jrb2 = new JRadioButton("女");

JRadioButton jrb3 = new JRadioButton("无");

ButtonGroup bg=new ButtonGroup();

bg.add(jrb1);

bg.add(jrb2);

bg.add(jrb3);

jrb1.setSelected(true);

JComboBox jcb = new JComboBox(labels1);

jcb.setEditable(true);

JList jli=new JList(labels2);

JScrollPane jsp=new JScrollPane(jli);

setContentPane(jsp);

JPanel jp= new JPanel();

jp.add(jlb1);jp.add(jlb2);jp.add(jlb3);

jp.add(jrb1);jp.add(jrb2);jp.add(jrb3);

jp.add(jlb4);jp.add(jcb);

jp.add(jlb5);jp.add(jsp);

setContentPane(jp);

setSize(170,450);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main(String[] args) {

new person();

}}