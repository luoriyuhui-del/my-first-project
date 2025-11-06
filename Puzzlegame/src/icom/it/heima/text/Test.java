package icom.it.heima.text;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class Test {
    public static void main(String[] args) {
        // ------------------------------- 实现按钮动作监听器 : 方法一 -------------------------------
        // ------------------------------       使用匿名内部类        -------------------------------

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

        //创建一个按钮对象
        JButton jtb = new JButton("点我");
        //设置位置和宽高
        jtb.setBounds(0,0,100,50);

        //给按钮添加动作监听器 ---- 通过匿名内部类 : 创建一个实现类 -- 接口 : ActionListener 的匿名内部类重写方法
        // ActionListener : 监听器接口 --- 只要是实现这个接口的类 , 就可以作为动作监听器 ( 多态 )
        //jtb : 组件对象 ( 组件 : 按钮 图片 等等 ) , 表示你要给那个组件添加动作
        //addActionListener : add - 添加 ; ActionListener : 监听器接口
        // ---- 表示我要给那个组件添加哪个事件监听 ( 此时是动作监听 : 鼠标左键点击 或 空格 )
        // --- 在括号 参数 里输入 new ActionListener() , 去调用 actionPerformed() 方法 --- 即你要执行的监听动作代码
        jtb.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("点击了按钮");
            }
        });
        //添加到界面
        jFrame.add(jtb);


        //打开界面展示
        jFrame.setVisible( true);
    }
}
