package Text.Text1;

import java.sql.SQLOutput;

public class Text {
    public static void main(String[] args) {
        System.out.println("--------------------- 接口的实现关系 -------------------");
        //   第一种 : 匿名内部类 --- 创建接口实现类的"对象"
        Play p  =  new Play(){
            //进行方法重写
            @Override
            public void playGame() {
                System.out.println("Playing...");
            }
        };
        //通过上面创建的对象调用方法
        p.playGame();

        //第二种 : 通过创建接口的实现类对象再实现中调用方法
        inter i = new inter();
        i.playGame();


        System.out.println("--------------------- 继承关系 -------------------");
        //第二种 : 通过创建父类的子类对象再实现中调用方法
        Sun ss = new Sun();
        ss.fun();

        // 第一种 : 匿名内部类 --- 创建父类的匿名子类的"对象"
        Fun ff = new Fun(){
            @Override
            public void fun(){
                System.out.println("SUN--FUN");
            }
        };

        ff.fun();
    }
}
