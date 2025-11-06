package icom.it.heima.ui;

import javax.swing.*;
import javax.swing.border.BevelBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

public class GameJFrame extends JFrame implements KeyListener, ActionListener {
    //与游戏相关的代码都在GameJFrame类中

    // ----------------------------- 成员变量 -----------------------------

    //创建一个二维数组
    //目的 : 创建一个二维数组 , 用来保存图片的编号数据
    //加载图片的时候 , 会根据二维数组中的数据加载图片
    int[][] data = new int[4][4];

    //给图片编号为0的图片标记
    int x = 0 ;
    int y = 0 ;

    //定义一个图片路径字符串数组
    String[] imageArray = {"Puzzlegame\\image\\animal\\animal" , "Puzzlegame\\image\\girl\\girl" , "Puzzlegame\\image\\sport\\sport"};
    //定义一个图片的集编码
    int imageIndex = 1;
    //定义一个图片路径变量
    String imagePath = imageArray[0] + imageIndex + "\\";

    //创建一个正确图片的二维数组  --- 用来判断图片是否正确
    int[][] win = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 0}
    };

    //定义一个变量统计步数
    int step = 0;

    //创建菜单项中的子菜单条目项
    JMenuItem replayItem = new JMenuItem("重新游戏");
    JMenuItem reLoginItem = new JMenuItem("重新登录");
    JMenuItem closeItem = new JMenuItem("关闭游戏");
    JMenuItem accountItem = new JMenuItem("公众号");
    JMenuItem girl = new JMenuItem("美女");
    JMenuItem animal = new JMenuItem("动物");
    JMenuItem sport = new JMenuItem("运动");

    //----------------------------- 构造方法 -----------------------------
    // ------ 空参构造初始化窗体
    //1 . 新建游戏界面UI
    public GameJFrame() {
        //初始化界面   --- JFrame 窗体 --- 它是一个javaBean类
        initJFrame();

        //初始化菜单
        initJMenuBar();

        //初始化图片数据( 将图片打乱存于二维数组中 )
        initData();

        //初始化图片( 直接调用二维数组来访问图片编号 )
        initImage();

        //设置界面显示状态   --- 展示界面放在最后 ( 因为要全部初始化所有的界面内容后再打开窗口可见 )
        this.setVisible(true);//设置窗体可见 -- ( 默认是false : 不可见 )

        //给界面添加键盘监听器
        this.addKeyListener(this);
    }


    // --------------------------------- 初始化图片数据( 将图片打乱存于二维数组中 ) ---------------------------------
    private void initData() {
        // 1. 新建一维数组存储图片编号 0 ~ 15 ( 0 : 空白 )
        int[] tempArr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};

        // 2. 打乱一维数组中的数据
        Random r = new Random();
        for (int i = 0; i < tempArr.length; i++) {
            //获取随机数
            int index = r.nextInt(tempArr.length);
            int temp = tempArr[i];
            tempArr[i] = tempArr[index];
            tempArr[index] = temp;
        }

        // 3. 将图片编号保存到二维数组中
        for (int i = 0; i < tempArr.length; i++) {
            //找到图片编号为0的在二维数组中的位置
            if( tempArr[i] == 0 ){
                x = i / 4;
                y = i % 4;
            }

            //获取图片编号 --- 天才的想法 ( 逢4进1 )
            data[ i / 4 ][ i % 4 ] = tempArr[i];
        }
    }

    // --------------------------------- 初始化图片( 直接调用二维数组来访问图片编号 ) ---------------------------------
    private void initImage() {

        //当每次图片位置发生改变后 , 需要重新初始化图片 -- 清空当前图片
        this.getContentPane().removeAll();

        //判断图片位置是否正确 ( 验证图片是否正确 ) -- 如果正确弹出 胜利图片
        if( victory() ){
            JLabel winjLabel = new JLabel(new ImageIcon("Puzzlegame\\image\\win.png"));
            //设置图片的位置和宽高
            winjLabel.setBounds(203, 283, 197, 73);
            //将图片添加到界面中
            this.getContentPane().add(winjLabel);
        }

        //创建图片管理容器 -- 管理文字
        JLabel stepCount = new JLabel("已走" + step + "步");
        stepCount.setBounds(50, 30, 100, 20);
        this.getContentPane().add(stepCount);

        //创建一个图片 ImageIcon的对象  -- ( 在java中创建图片对象 -- ImageIcon )
        // 图片的路径
        //* 1 - 1 : ImageIcon icon = new ImageIcon("D:\\code_java\\basic-code\\Puzzlegame\\image\\animal\\animal3\\1.jpg");

        //创建一个JLabel对象 ( JLabel是一个管理容器 -- 管理图片或文字 )
        //把图片添加到JLabel中   --- 默认居中显示
        // 1 - 2 " JLabel jLabel = new JLabel(icon);

        //添加图片时分两种方式
        //相对路径 : 默认是项目下的文件夹中的文件
        //绝对路径 : 默认是从盘符C : 出发的

        //创建循环 , 依次创建图片 4 * 4 的循环 : 根据x  y 的规律改变图片的位置
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                //将上面的代码 1 - 1 与 1 - 2 合并成一条
                // 图片的路径编号直接使用二维数组 data[i][j] 来获取 , 并且data[i][j] 定义在外部
                JLabel jLabel = new JLabel(new ImageIcon(imagePath + data[i][j] + ".jpg"));

                //设置图片的位置和宽高  --- 以图片的左上角为顶点
                //在getContentPane()是JFrame对象自动添加到界面中的一个界面 , 界面中添加的组件都添加到这个界面中 ,
                // --- ( 注意 : 给图片添加 x y w h 之前要取消界面的默认居中显示模式 )
                // 在这个界面 x : 0  y : 0 的位置在界面的左上角 , 水平为 x 轴 \ 垂直为 y 轴
                //同时对图片的位置进行调整 , 使其位于隐藏界面中下侧
                jLabel.setBounds(105 * j + 83, 105 * i + 134, 105, 105);

                //给每张图片添加边框
                // BevelBorder : 边框样式 --- 它是Border接口的实现类
                //BevelBorder.LOWERED : 凹边 = 1  /   BevelBorder.RAISED : 凸边 = 0
                jLabel.setBorder(new BevelBorder(BevelBorder.LOWERED));
                //给图片添加边框颜色
                //jLabel.setBorder(BorderFactory.createLineBorder(Color.black));

                //把管理容器JLabel添加到界面中
                this.getContentPane().add(jLabel);
            }
        }

        //给15张图片添加背景图片
        // 细节 : 先加载的图片在界面中显示在上方 , 后加载的图片显示在下方
        JLabel background = new JLabel(new ImageIcon("Puzzlegame\\image\\background.png"));
        background.setBounds(40, 40, 508, 560);
        //把背景图片添加到界面中
        this.getContentPane().add(background);

        //清空当前的图片后 , 会根据新的二维数组重新排版 , 然后刷新界面
        this.getContentPane().repaint();
    }

    // --------------------------------- 初始化菜单栏 ---------------------------------
    private void initJMenuBar() {
        //初始化菜单
        //创建整个菜单对象 -- 菜单栏( JMenuBar ) --- 菜单项( JMenu ) --- 菜单项事件
        JMenuBar jMenuBar = new JMenuBar(); // --- 创建菜单栏

        //创建菜单栏中的菜单项 ( 1.功能  2.关于我们 )
        JMenu functionJMenu = new JMenu("功能");
        JMenu aboutJMenu = new JMenu("关于我们");

        //3.重新选择图片菜单
        JMenu changeImage = new JMenu("重新选择图片");

        //将子菜单条目项添加到菜单项中
        functionJMenu.add(replayItem);
        functionJMenu.add(reLoginItem);
        functionJMenu.add(closeItem);

        //将图片类型子菜单条目添加到重新选择图片中
        changeImage.add(girl);
        changeImage.add(animal);
        changeImage.add(sport);

        //将重新选择图片添加到功能菜单中 -- 菜单项的嵌套
        functionJMenu.add(changeImage);

        //添加公众号到菜单项 "关于我们" 中
        aboutJMenu.add(accountItem);

        //给菜单项添加事件 -- ActionListener动作监听器
        replayItem.addActionListener(this) ;// 表示点击重新游戏
        reLoginItem.addActionListener(this) ;// 表示点击重新登录
        closeItem.addActionListener(this) ;// 表示点击关闭游戏
        accountItem.addActionListener(this) ;// 表示点击公众号
        girl.addActionListener(this) ;// 表示点击选择美女图片
        animal.addActionListener(this) ;// 添加点击选择动物图片
        sport.addActionListener(this) ;// 添加点击选择运动图片

        //将菜单项添加到菜单栏中
        jMenuBar.add(functionJMenu);
        jMenuBar.add(aboutJMenu);

        //将菜单栏添加到窗体中
        this.setJMenuBar(jMenuBar);
    }

    // --------------------------------- 初始化界面 ---------------------------------
    private void initJFrame() {
        //设置界面的宽高
        this.setSize(603, 680);
        //设置界面的窗口标题
        this.setTitle("拼图游戏单机版 V1.0");
        //设置界面的位置置顶
        this.setAlwaysOnTop(true);
        //设置界面位置居中
        this.setLocationRelativeTo(null);
        //设置界面关闭模式
        //windowConstants 是方法名
        //在括号里也可以输入3 --- 在方法体中关闭模式( WindowConstants.EXIT_ON_CLOSE ) final为3 --- 表示关闭一个窗口就结束进程
        // 在方法体中关闭模式( WindowConstants.DISPOSE_ON_CLOSE ) final为2 --- 关闭最后打开的窗口才结束进程
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        //取消图片的窗体默认居中
        this.setLayout(null);
    }

    // ---------------------------------  ( 重写方法 ) ---------------------------------
    @Override
    public void keyTyped(KeyEvent e) {

    }

    //按下不松时会显示图片的完整样子 , 松开后图片恢复原先打乱的样子
    @Override
    public void keyPressed(KeyEvent e) {
        //判断游戏是否胜利 -- 如果胜利则直接结束方法
        if(victory()){
            //return的作用  1.返回结果  2.结束方法
            return;
        }

        //获取键盘输入的键位
        int keyCode = e.getKeyCode();
        //对键位A 进行判断
        if(keyCode == 65){
            //把原先图片清空
            this.getContentPane().removeAll();
            //加载完整图片
            JLabel all = new JLabel(new ImageIcon(imagePath + "all.jpg"));
            //设置图片的位置和宽高
            all.setBounds(83, 134, 420, 420);
            //把图片添加到界面中
            this.getContentPane().add(all);

            //加载背景图
            JLabel background = new JLabel(new ImageIcon("Puzzlegame\\image\\background.png"));
            background.setBounds(40, 40, 508, 560);
            //把背景图片添加到界面中
            this.getContentPane().add(background);

            //刷新界面
            this.getContentPane().repaint();
        }
    }

    //在按键松开时 , 需要恢复图片的打乱顺序 --- 判断键位 == a(65) 时 , 重新调用InitImage()方法
    @Override
    public void keyReleased(KeyEvent e) {
        //判断游戏是否胜利 -- 如果胜利则直接结束方法
        if(victory()){
            //return的作用  1.返回结果  2.结束方法
            return;
        }

        //获取键盘输入的键位
        int keyCode = e.getKeyCode();
        //对 : 上 下 左 右 进行判断
        // 左 : 37  - 右 : 39  - 上 : 38  - 下 : 40
        if(keyCode == 37){
            System.out.println("左移");

            //添加边界条件 -- 保证索引值不能越界
            if( y == 3 ){
                return;
            }

            //左移 : 将二维数组中的行索引 y + 1 的数据移动到当前索引位置 --- 替换掉空白图片
            data[x][y] = data[x][y + 1];
            //将当前索引位置的数据设置为0 --- 表示空白图片
            data[x][y + 1] = 0;
            //然后更新空白图片的位置 : x  -- y = y + 1
            y++;

            //每当执行一次代码后 , step步数自增
            step++;

            //当二维数组中的索引更新后 , 需要重新绘制界面 --- 调用InitImage()方法
            initImage();


        }else if(keyCode == 38 ){
            System.out.println("上移");

            //添加边界条件 -- 保证索引值不能越界
            if( x == 3 ){
                return;
            }

            //上移 : 将二维数组中的行索引 x + 1 的数据移动到当前索引位置 --- 替换掉空白图片
            data[x][y] = data[  x + 1 ][y];
            //将当前索引位置的数据设置为0 --- 表示空白图片
            data[x + 1][y] = 0;
            //然后更新空白图片的位置 : x = x + 1  --  y
            x++;

            //每当执行一次代码后 , step步数自增
            step++;

            //当二维数组中的索引更新后 , 需要重新绘制界面 --- 调用InitImage()方法
            initImage();

        }else if(keyCode == 39){
            System.out.println("右移");

            //添加边界条件 -- 保证索引值不能越界
            if( y == 0 ){
                return;
            }

            //右移 : 将二维数组中的列索引 y - 1 的数据移动到当前索引位置 --- 替换掉空白图片
            data[x][y] = data[x][y - 1];
            //将当前索引位置的数据设置为0 --- 表示空白图片
            data[x][y - 1] = 0;
            //然后更新空白图片的位置 : x  -- y = y - 1
            y--;

            //每当执行一次代码后 , step步数自增
            step++;

            //当二维数组中的索引更新后 , 需要重新绘制界面 --- 调用InitImage()方法
            initImage();

        }else if(keyCode == 40){
            System.out.println("下移");

            //添加边界条件 -- 保证索引值不能越界
            if( x == 0 ){
                return;
            }

            //下移 : 将二维数组中的行索引 x - 1 的数据移动到当前索引位置 --- 替换掉空白图片
            data[x][y] = data[x - 1][y];
            //将当前索引位置的数据设置为0 --- 表示空白图片
            data[x - 1][y] = 0;
            //然后更新空白图片的位置 : x = x - 1  --  y
            x--;

            //每当执行一次代码后 , step步数自增
            step++;

            //当二维数组中的索引更新后 , 需要重新绘制界面 --- 调用InitImage()方法
            initImage();
        }else if( keyCode == 65 ){

            //重新调用InitImage()方法
            initImage();

        }else if( keyCode == 87 ){
            //作弊 : 按下 W 键 , 自动将图片排序到正确的位置

            //对保存图片的数组进行结果化置
            data = new int[][]{
                    {1,2,3,4},
                    {5,6,7,8},
                    {9,10,11,12},
                    {13,14,15,0}
            };
            //重新调用InitImage()方法 , 打印的就是完整的图片位置了
            initImage();
        }
    }

    //创建方法 -- 用来判断图片是否排好序 -- 正确即 胜利
    public boolean victory(){
        //遍历二维数组data
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                //但有一个位置不对直接返回false
                if( data[i][j] != win[i][j]){
                    return false;
                }
            }
        }

        //循环结束 , 表示图片都是处于正确的位置 , 返回true
        return true;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //获取当前点击的条目对象 -- e.getSource()是获取Object对象( 包括它的子类 : 几乎包括所有类型 )
        Object obj = e.getSource();

        //判断条目对象
        if( obj == replayItem ){
            System.out.println("重新开始");

            //计步器清零
            step = 0;
            //打乱二维数组中图片的位置
            initData();
            //重新调用InitImage()方法
            initImage();

        }else if( obj == reLoginItem ){
            System.out.println("重新登录");

            //关闭当前游戏界面
            this.setVisible(false);
            //打开登录界面
            new LoginJFrame();

        }else if( obj == closeItem ){
            System.out.println("关闭游戏");

            //退出虚拟机
            System.exit(0);

        }else if( obj == accountItem ){
            System.out.println("公众号");

            //新建一个弹框对象
            JDialog jDialog = new JDialog();
            //新建一个图片对象和管理图片的组件
            JLabel jLabel = new JLabel(new ImageIcon("Puzzlegame\\image\\about.png"));
            //设置图片的大小位置
            jLabel.setBounds(0,0,258,258);
            //将管理器的图片添加到弹框中的getContentPane()方法的隐藏界面中
            jDialog.getContentPane().add(jLabel);
            //设置弹框的大小位置
            jDialog.setSize(344,344);
            //设置弹框的置顶
            jDialog.setAlwaysOnTop(true);
            //设置弹框的位置
            jDialog.setLocationRelativeTo(null);
            //设置弹框不被关闭则禁止点击其他地方
            jDialog.setModal(true);
            //弹框可见
            jDialog.setVisible(true);

        }else if( obj == girl ){
            System.out.println("美女图片");

            //判断如果已经胜利就不可再点击
            if( victory() ){
                return;
            }

            //调用initData()方法 -- 打乱图片位置
            initData();
            //改变图片路径
            Random r = new Random();
            imageIndex = r.nextInt(11) + 1;
            imagePath = imageArray[1] + imageIndex + "\\";
            //记步数 清零
            step = 0;
            //调用initImage()方法 -- 显示图片
            initImage();

        }else if( obj == animal ){
            System.out.println("动物图片");

            //判断如果已经胜利就不可再点击
            if( victory() ){
                return;
            }

            //调用initData()方法 -- 打乱图片位置
            initData();
            //改变图片路径
            Random r = new Random();
            imageIndex = r.nextInt(8) + 1;
            imagePath = imageArray[0] + imageIndex + "\\";
            //记步数 清零
            step = 0;
            //调用initImage()方法 -- 显示图片
            initImage();

        }else if( obj == sport ){
            System.out.println("运动图片");

            //判断如果已经胜利就不可再点击
            if( victory() ){
                return;
            }

            //调用initData()方法 -- 打乱图片位置
            initData();
            //改变图片路径
            Random r = new Random();
            imageIndex = r.nextInt(10) + 1;
            imagePath = imageArray[2] + imageIndex + "\\";
            //记步数 清零
            step = 0;
            //调用initImage()方法 -- 显示图片
            initImage();
        }
    }
}
