一. 简答题（共1题，100分）

1. (简答题)
   设计一个个人信息窗体，参考程序如下：（可增减窗体中的内容），上交程序及窗体截图

import javax.swing.*;

import java.awt.*;

public class person2 extends JFrame {

JLabel jlb1,jlb2,jlb3,jlb4,jlb5;

String labels1[]= {"阅读","锻炼","外出旅行","绘画","修身养性"};

String labels2[]= {"中国","美国","日本","英国","法国"};

public person2() {

super("整合演示");

setResizable(true);

setLocationRelativeTo(null);

Icon ic1=new ImageIcon("D:/yy/qy.jpg");

jlb1=new JLabel("头像");

jlb1.setBounds(15, 45, 50, 50);

jlb2=new JLabel(ic1);

jlb2.setBounds(50, 0, 120, 150);

jlb3=new JLabel("性别");

jlb3.setBounds(15, 150, 50, 50);

jlb4=new JLabel("兴趣爱好");

jlb4.setBounds(15, 200, 60, 50);

jlb5=new JLabel("国籍");

jlb5.setBounds(15, 250, 50, 50);

JRadioButton jrb1 = new JRadioButton("男");

JRadioButton jrb2 = new JRadioButton("女");

JRadioButton jrb3 = new JRadioButton("无");

ButtonGroup bg=new ButtonGroup();

bg.add(jrb1);

bg.add(jrb2);

bg.add(jrb3);

jrb1.setSelected(true);

jrb1.setBounds(50, 150, 40, 50);

jrb2.setBounds(90, 150, 40, 50);

jrb3.setBounds(130, 150, 40, 50);

JComboBox jcb = new JComboBox(labels1);

jcb.setEditable(true);

jcb.setBounds(80, 205, 100, 40);

JList jli=new JList(labels2);

JScrollPane jsp=new JScrollPane(jli);

setContentPane(jsp);

jsp.setBounds(80, 250, 100, 100);

JPanel jp= new JPanel();

jp.add(jlb1);jp.add(jlb2);jp.add(jlb3);

jp.add(jrb1);jp.add(jrb2);jp.add(jrb3);

jp.add(jlb4);jp.add(jcb);

jp.add(jlb5);jp.add(jsp);

setContentPane(jp);

setLayout(null);

setSize(200,500);

setVisible(true);

setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}

public static void main(String[] args) {

new person2();

}}
}}