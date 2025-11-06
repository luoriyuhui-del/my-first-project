package icom.it.heima.text;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyJFrame2 extends JFrame implements MouseListener {
    // ------------------------- 新建鼠标监听器类 -------------------------

    //新建按钮组件成员变量
    JButton jtb1 = new JButton("点我试试看");

    //创建空参构造 方法
    public MyJFrame2(){
        // ------------------------------- 实现按钮鼠标监听器  -------------------------------
        // -------- 创建类继承JFrame 和实现 MouseListener 在本类中重写方法代码 直接调用本身this -------

        //新建界面 , 在界面中新建按钮属性 , 定义 -----  按钮鼠标监听器  ---- 点下按钮后 执行某个方法

        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("通过匿名内部类实现按钮鼠标监听器");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置界面的布局方式
        this.setLayout(null);

        //设置位置和宽高 --- 并添加按钮绑定鼠标监听器
        // ( 因为类本身就重写了动作方法 -- ( 本类就是实现类 ), 在参数中直接调用本身this )
        jtb1.setBounds(0,0,100,50);
        jtb1.addMouseListener(this);

        //将按钮添加到getContentPane隐藏容器 界面中
        this.getContentPane().add(jtb1);

        //打开界面展示
        this.setVisible( true );
    }

    //重写MouseListener接口方法代码
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了按钮1");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("按下了按钮1 -- 但是没有松开");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("抬起了按钮1 -- 松开");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("划入按钮1");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("划开按钮1");
    }
}
