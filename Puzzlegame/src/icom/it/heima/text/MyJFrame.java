package icom.it.heima.text;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class MyJFrame extends JFrame implements ActionListener {
    // --------------------- 这是动作监听器实现类 --------------------

    //创建成员变量
    //创建两个按钮对象
    JButton jtb1 = new JButton("点我");
    JButton jtb2 = new JButton("点你");


    //创建一个窗体 --- 无参构造方法
    public MyJFrame(){
        // ------------------------------- 实现按钮动作监听器 : 方法二 -------------------------------
        // -------- 创建类继承JFrame 和实现 ActionListener 在本类中重写方法代码 直接调用本身this -------

        //新建界面 , 在界面中新建按钮属性 , 定义 -----  按钮动作监听器  ---- 点下按钮后 执行某个方法
        //按钮属性 属于
        //第一种写法 : 通过匿名内部类 实现
        JFrame jFrame = new JFrame();
        //设置界面的宽高
        jFrame.setSize(603,680);
        //设置界面的标题
        jFrame.setTitle("通过匿名内部类实现按钮动作监听器");
        //设置界面置顶
        jFrame.setAlwaysOnTop(true);
        //设置界面居中
        jFrame.setLocationRelativeTo(null);
        //设置界面的关闭模式
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置界面的布局方式
        jFrame.setLayout(null);

        //设置位置和宽高 --- 并添加按钮动作监听器
        // ( 因为类本身就重写了动作方法 -- ( 本类就是实现类 ), 在参数中直接调用本身this )
        jtb1.setBounds(0,0,100,50);
        jtb1.addActionListener(this);

        jtb2.setBounds(100,0,100,50);
        jtb2.addActionListener(this);

        //将按钮添加到getContentPane隐藏容器 界面中
        jFrame.getContentPane().add(jtb1);
        jFrame.getContentPane().add(jtb2);

        //打开界面展示
        jFrame.setVisible( true );
    }

    //重写方法代码
    @Override
    public void actionPerformed(ActionEvent e) {
        //对当前的按钮进行判断

        //获取当前点击的按钮对象
        Object source = e.getSource();
        if(source == jtb1){
            System.out.println("点击了按钮1");
            //修改按钮大小
            jtb1.setSize(200,200);
        }else if(source == jtb2){
            System.out.println("点击了按钮2");
            Random r = new Random();
            //修改按钮位置
            jtb2.setLocation(r.nextInt(500) , r.nextInt(500));
        }
    }
}
