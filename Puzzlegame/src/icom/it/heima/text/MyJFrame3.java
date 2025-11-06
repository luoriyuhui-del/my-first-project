package icom.it.heima.text;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyJFrame3 extends JFrame implements KeyListener {
    // ------------------------- 新建键盘监听器类 -------------------------

    //键盘监听一般是对于整个界面的监听器

    //创建空参构造 方法
    public MyJFrame3(){
        // ------------------------------- 实现按钮键盘监听器  -------------------------------
        // -------- 创建类继承JFrame 和实现 KeyListener 在本类中重写方法代码 直接调用本身this -------

        //设置界面的宽高
        this.setSize(603,680);
        //设置界面的标题
        this.setTitle("通过匿名内部类实现按钮键盘监听器");
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面的关闭模式
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //设置界面的布局方式
        this.setLayout(null);

        //给整个界面添加键盘监听器
        //调用者 this : 本类对象 , 当前的界面对象 , 表示我要给整个界面添加键盘监听器
        //addKeyListener : 表示要给本界面添加键盘监听
        //参数this : 当事件被触发后 , 执行本类中的对应代码
        this.addKeyListener(this);

        //打开界面展示
        this.setVisible( true );
    }

    @Override
    public void keyTyped(KeyEvent e) {
        //一般使用不到
    }

    //细节一 :
    //如果按键按下了, 但是没有松开, 那么事件就会一直触发
    //细节二 :
    //键盘里这么多键位 , 我们要怎么区分
    //键盘有一一对应的键位码 ( 编号 )
    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("按下键盘不松");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println("松开键盘按键");
        int KeyCode = e.getKeyCode();
        if( KeyCode == 65 ){
            System.out.println("按下了A键位");
        }else if( KeyCode == 68 ){
            System.out.println("按下了D键位");
        }
    }
}
