package a04staticdemo4;

public class Text {
    public static void main(String[] args) {
        // --------------------------- 继承性 ---------------------------



        //通过父类子类 , 在子类中使用 extends 关键字继承父类的属性和方法
        //在java中, 父类和子类是两个不同的类, 只能单继承 --- 一个子类只能继承一个父类
        // 但是可以多重继承 一个子类的父类可以再有父类
        ChineCat c = new ChineCat();
        c.show();
        c.catchMouse();
        c.eat();
        c.drink();

        BuouCat b = new BuouCat();
        b.show();
        b.catchMouse();
        b.eat();
        b.drink();
    }
}
