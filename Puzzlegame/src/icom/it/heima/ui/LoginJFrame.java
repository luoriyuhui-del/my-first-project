package icom.it.heima.ui;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class LoginJFrame extends JFrame implements MouseListener {
    //2 . 创建游戏登录窗口
    //与游戏相关的代码都在LoginJFrame类中

    //初始化一些成员信息
    public static final String USER_NAME = "admin";
    public static final String PASSWORD = "admin";

    //将组件创建在成员变量中 --- 利于方法访问
    JLabel LoginName = new JLabel(new ImageIcon("Puzzlegame\\image\\login\\用户名.png"));
    JTextField nameText = new JTextField();
    JLabel LoginPassword = new JLabel(new ImageIcon("Puzzlegame\\image\\login\\密码.png"));
    JPasswordField passwordText = new JPasswordField();
    JLabel LoginVerificationCode = new JLabel(new ImageIcon("Puzzlegame\\image\\login\\验证码.png"));
    JTextField verificationCodeText = new JTextField();
    JLabel verificationCodeTextTip = new JLabel(VerificationCodeUtil.getVerificationCode());
    JButton loginButton = new JButton(new ImageIcon("Puzzlegame\\image\\login\\登录按钮.png"));
    JButton registerButton = new JButton(new ImageIcon("Puzzlegame\\image\\login\\注册按钮.png"));

    //创建弹框对象
    //JDialog jDialog = new JDialog();

    //无参构造 方法
    public LoginJFrame(){
        //创建界面窗口
        initJFrame();

        //创建登录界面
        initView();

        //设置界面显示状态   --- 展示界面放在最后 ( 因为要全部初始化所有的界面内容后再打开窗口可见 )
        this.setVisible(true);//设置窗体可见 -- ( 默认是false : 不可见 )
    }

    // ------------------------------------- 创建登录界面 -------------------------------------
    private void initView() {
        //创建用户名框
        LoginName.setBounds( 86, 135, 51, 19 );
        this.getContentPane().add(LoginName);

        //创建用户名的文本输入框 ---- JTextField是明文输入框
        //获取输入框的文字
        nameText.setBounds( 145, 134, 200, 30 );
        this.getContentPane().add(nameText);

        //创建密码框
        LoginPassword.setBounds( 100, 175, 35, 18 );
        this.getContentPane().add(LoginPassword);

        //创建密码的文本输入框 --- JPasswordField是密文输入框
        passwordText.setBounds( 145, 175, 200, 30 );
        this.getContentPane().add(passwordText);

        //创建验证码框
        LoginVerificationCode.setBounds( 86, 215, 56, 21 );
        this.getContentPane().add(LoginVerificationCode);

        //创建验证码文本输入框
        verificationCodeText.setBounds( 145, 215, 100, 30 );
        this.getContentPane().add(verificationCodeText);

        //创建验证码文字提示
        verificationCodeTextTip.setBounds( 280, 215, 50, 30 );
        this.getContentPane().add(verificationCodeTextTip);
        //给验证码添加鼠标监听 -- 当你点击验证码时，验证码会自动更新
        verificationCodeTextTip.addMouseListener(this);



        //创建登录按钮
        loginButton.setBounds( 133, 260, 90, 40 );
        this.getContentPane().add(loginButton);
        //添加鼠标监听
        loginButton.addMouseListener(this);

        //创建注册按钮
        registerButton.setBounds( 256, 260, 90, 40 );
        this.getContentPane().add(registerButton);
        //添加鼠标监听
        registerButton.addMouseListener(this);


        //创建背景色
        JLabel background = new JLabel(new ImageIcon("Puzzlegame\\image\\login\\background.png"));
        background.setBounds(-8,0,490,390);
        this.getContentPane().add(background);
    }

    // ------------------------------------- 创建界面窗口 -------------------------------------
    private void initJFrame() {

        //设置界面的宽高
        this.setSize(488,430);
        //设置界面的窗口标题
        this.setTitle("拼图游戏 登录界面");
        //设置界面的位置置顶
        this.setAlwaysOnTop( true );
        //设置界面位置居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        //windowConstants 是方法名
        //在括号里也可以输入3 --- 在方法体中关闭模式( WindowConstants.EXIT_ON_CLOSE ) final为3 --- 表示关闭一个窗口就结束进程
        // 在方法体中关闭模式( WindowConstants.DISPOSE_ON_CLOSE ) final为2 --- 关闭最后打开的窗口才结束进程
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//在括号里也可以输入3 --- 在方法体中关闭模式final为3

        //取消图片的窗体默认居中
        this.setLayout(null);
    }


    // ------------------------------------- 重写鼠标监听方法 -------------------------------------
    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("点击了按钮");

        //获取点击的组件
        Object obj = e.getSource();
        //判断点击的是否是登录按钮
        if(obj == loginButton){
            System.out.println("点击了登录按钮");

            //获取用户输入的账号和密码
            String name = nameText.getText();
            String password = new String(passwordText.getPassword());
            //获取用户输入的验证码
            String verificationCode = verificationCodeText.getText();

            //判断用户输入的账号和密码是否为 空
            if( name.length() == 0 || password.length() == 0 || verificationCode.length() == 0 ){
                System.out.println("用户名或密码不能为空");
            }else{
                //判断用户输入的验证码是否正确
                if(verificationCode.equalsIgnoreCase(verificationCodeTextTip.getText())){
                    //判断用户输入的账号和密码是否正确
                    if(name.equals(USER_NAME) && password.equals(PASSWORD)){
                        System.out.println("登录成功");
                        //关闭当前界面
                        this.dispose();

                        //打开游戏界面
                        new GameJFrame();
                    }else{
                        //提示用户
                        JOptionPane.showMessageDialog(this,"用户名或密码错误");
                        //清空密码输入框
                        passwordText.setText("");
                        //清空用户输入框
                        nameText.setText("");
                        //刷新验证码
                        String newCode = VerificationCodeUtil.getVerificationCode();
                        verificationCodeTextTip.setText(newCode);
                        //清空验证码输入框
                        verificationCodeText.setText("");
                    }
                }else{
                    //验证码错误
                    JOptionPane.showMessageDialog(this,"验证码错误");
                    //刷新验证码
                    String newCode = VerificationCodeUtil.getVerificationCode();
                    verificationCodeTextTip.setText(newCode);
                    //清空验证码输入框
                    verificationCodeText.setText("");
                }
            }

        }else if( obj == registerButton ){

            System.out.println("点击了注册按钮");
            //关闭当前界面
            this.dispose();
            //打开注册界面
            new RegisterJFrame();

        }else if(obj == verificationCodeTextTip){
            System.out.println("更换验证码");
            //刷新验证码
            String newCode = VerificationCodeUtil.getVerificationCode();
            verificationCodeTextTip.setText(newCode);
            //清空验证码输入框
            verificationCodeText.setText("");
        }


    }

    @Override
    public void mousePressed(MouseEvent e) {
        //获取点击的组件
        Object obj = e.getSource();
        if(obj == loginButton){

            System.out.println("按下了登录按钮");
            //设置按钮按下时的图片
            loginButton.setIcon(new ImageIcon("Puzzlegame\\image\\login\\登录按下.png"));

        }else if(obj == registerButton ){

            System.out.println("按下了注册按钮");
            //设置按钮按下时的图片
            registerButton.setIcon(new ImageIcon("Puzzlegame\\image\\login\\注册按下.png"));

        }

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        //获取点击的组件
        Object obj = e.getSource();
        if(obj == loginButton){

            System.out.println("抬起了登录按钮");
            //设置按钮抬起时的图片
            loginButton.setIcon(new ImageIcon("Puzzlegame\\image\\login\\登录按钮.png"));

        }else if(obj == registerButton ){

            System.out.println("抬起了注册按钮");
            //设置按钮按下时的图片
            registerButton.setIcon(new ImageIcon("Puzzlegame\\image\\login\\注册按钮.png"));

        }
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        //System.out.println("划入登录按钮");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        //System.out.println("划开登录按钮");
    }
}