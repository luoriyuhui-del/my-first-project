package com.itheima.a03runtimedemo;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class MyJframe extends JFrame implements ActionListener {
    //新建成员变量
    private JButton yesBut = new JButton("小贪吃兔兔");
    private JButton midBut = new JButton("赖床小兔兔");
    private JButton noBut = new JButton("高冷小兔兔");
    private JButton quitBut = new JButton("给你小机会");

    //定义一个boolean变量 , 判断是否弹出quitBut
    private boolean flag = false;
    
    // 记录已添加的监听器，避免重复添加
    private boolean listenersAdded = false;

    //空参构造
    public MyJframe(){
        //恶搞小游戏

        //设置界面
        initJFrame();

        //添加组件
        initView();


        //设置界面可见
        this.setVisible(true);

    }

    private void initView() {

        //removeAll()设置组件 表示清空当前界面所有组件
        this.getContentPane().removeAll();

        //判断flag
        if(flag){
            quitBut.setBounds(200, 100, 100, 30);
            this.getContentPane().add(quitBut);
            if (listenersAdded) {
                quitBut.addActionListener(this);
            }
        }

        //设置界面主题文字
        JLabel title = new JLabel("你觉得你是怎样的小兔兔");
        title.setFont(new Font("微软雅黑", Font.PLAIN, 20));
        title.setBounds(140, 150, 300, 50);
        this.getContentPane().add(title);

        //设置按钮界面
        yesBut.setBounds(200, 250, 100, 30);
        this.getContentPane().add(yesBut);
        midBut.setBounds(200, 300, 100, 30);
        this.getContentPane().add(midBut);
        noBut.setBounds(200, 350, 100, 30);
        this.getContentPane().add(noBut);


        //添加点击事件ActionListener
        if (!listenersAdded) {
            yesBut.addActionListener(this);
            midBut.addActionListener(this);
            noBut.addActionListener(this);
            listenersAdded = true;
        }


        //重新绘制界面 -- 刷新界面
        this.getContentPane().repaint();
    }

    private void initJFrame() {
        //设置界面宽高
        this.setSize(500, 600);
        //设置界面标题
        this.setTitle("小兔兔");
        //设置界面关闭模式
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //设置界面居中
        this.setLocationRelativeTo(null);
        //设置界面置顶
        this.setAlwaysOnTop(true);
        //取消默认布局
        this.setLayout(null);
    }

    //点击事件重写方法
    @Override
    public void actionPerformed(ActionEvent e) {
        Object obj = e.getSource();
        if(obj == yesBut){
            handleRabbitClick("小兔子很调皮哈 该打");
        } else if(obj == midBut ){
            handleRabbitClick("小兔子很懒哈 该打");
        } else if(obj == noBut ){
            handleRabbitClick("小兔子还是很可爱 该打");
        } else if( obj == quitBut ){
            showJDialog("放你一兔吧 哈哈哈");
            //取消关机操作
            Runtime runtime = Runtime.getRuntime();
            try {
                runtime.exec("shutdown -a");
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
            //退出程序
            System.exit(0);
        }
    }
    
    /**
     * 处理兔子按钮点击事件的通用方法
     * @param message 要显示的消息
     */
    private void handleRabbitClick(String message) {
        showJDialog(message);
        //获取当前运行环境
        Runtime runtime = Runtime.getRuntime();
        //运行cmd 设置60分钟后关机 (1200秒)
        try {
            runtime.exec("shutdown -s -t 1200");
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "设置关机失败: " + ex.getMessage(), "错误", JOptionPane.ERROR_MESSAGE);
        }

        //更改组件 -- 显示quitBut
        flag = true;
        initView();
    }

    public void showJDialog(String content) {
        //创建一个弹框对象
        JDialog jDialog = new JDialog();
        //给弹框设置大小
        jDialog.setSize(200, 150);
        //让弹框置顶
        jDialog.setAlwaysOnTop(true);
        //让弹框居中
        jDialog.setLocationRelativeTo(null);
        //弹框不关闭永远无法操作下面的界面
        jDialog.setModal(true);

        //创建Jlabel对象管理文字并添加到弹框当中
        JLabel warning = new JLabel(content);
        warning.setHorizontalAlignment(SwingConstants.CENTER);
        warning.setVerticalAlignment(SwingConstants.CENTER);
        jDialog.add(warning);

        //让弹框展示出来
        jDialog.setVisible(true);
    }
}