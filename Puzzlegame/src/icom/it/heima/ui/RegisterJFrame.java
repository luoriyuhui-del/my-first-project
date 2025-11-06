package icom.it.heima.ui;

import javax.swing.*;

public class RegisterJFrame extends JFrame {
    //3 . 创建游戏注册界面
    //与游戏注册的代码在RegisterJFrame类中

    public RegisterJFrame(){
        //JFrame 窗体 --- 它是一个javaBean类

        //设置界面的宽高
        this.setSize(488,500);
        //设置界面的窗口标题
        this.setTitle("拼图游戏 注册界面");
        //设置界面的位置置顶
        this.setAlwaysOnTop( true );
        //设置界面位置居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        //windowConstants 是方法名
        //在括号里也可以输入3 --- 在方法体中关闭模式( WindowConstants.EXIT_ON_CLOSE ) final为3 --- 表示关闭一个窗口就结束进程
        // 在方法体中关闭模式( WindowConstants.DISPOSE_ON_CLOSE ) final为2 --- 关闭最后打开的窗口才结束进程
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//在括号里也可以输入3 --- 在方法体中关闭模式final为3






        //设置界面显示状态   --- 展示界面放在最后 ( 因为要全部初始化所有的界面内容后再打开窗口可见 )
        this.setVisible(true);//设置窗体可见 -- ( 默认是false : 不可见 )
    }
}
