package a03polymorphismdemo3;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        //多态的优点 1 . 当定义一个类变量时 , 可以使用父类变量来引用子类对象
        //          2 . 创建方法参数时 , 可以使用父类参数来引用子类对象
        //应用场景 1 :
        /*StringBuilder sb = new StringBuilder();
        sb.append("object"); --- 当你使用StringBuilder对象时 , 可以调用object类型 -- 因为所有的类的父类都是object*/
        //应用场景 2 :
        /*ArrayList list = new ArrayList();
        list.add("object"); --- 如果不写泛型 , 默认是object类型*/

        //多态的弊端 --- 不能调用子类的独有方法
        //报错原因 ? --- 当调用成员方法时 , 编译看左边 , 运行看右边
        //那么在编译的时候会先检查左边的父类中有没有这个方法 , 如果没有 -- 直接报错
        /*Animal a = new Dog();----(自动类型转换)
        a.eat();
        a.show(); --- 当你调用子类的独有方法是 , 会报错*/

        //解决多态弊端的方案
        //让多态对象 变回 子类类型就可以
        //细节 : 转化的时候不能瞎转 , 如果转换的时候类型不对 , 会报ClassCastException
        //eg : 转化错的情况
        //Cat c = (Cat)a;  --- Dog类型的不能转为Cat类型
        //c.show();

        //那可以先判断是否为该类型在转化
        //1 .  ----- "instanceof" -------  判断对象是否为该类型
        // a instanceof Dog : 判断 a 对象是否为 Dog类型
        /*if(a instanceof Dog){
            Dog d = (Dog)a;(强制类型转换)
            d.show();
        }else if(a instanceof Cat){
            Cat c = (Cat)a;
            c.show();
        }else{
            System.out.println("没有这个类型");
        }*/

        //在jdk16时出现了新特性 a instanceof Dog 进行了优化
        // a instanceof Dog d (强制类型转换): 表示先判断a 对象是否为 Dog类型 , 如果是则将a对象转为Dog类型 为true , 否则为false
        /*if(a instanceof Dog d){
            d.show();
        }else if(a instanceof Cat c){
            c.show();
        }else{
            System.out.println("没有这个类型");
        }*/
    }
}

class Animal{
    public void eat(){
        System.out.println("吃东西");
    }
}
class Dog extends Animal{
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
    //子类特有的方法 , 在父类中没有
    public void show(){
        System.out.println("看家");
    }
}
class Cat extends Animal{
    @Override
    public void eat(){
        System.out.println("吃猫粮");
    }
    //子类特有的方法 , 在父类中没有
    public void show(){
        System.out.println("抓老鼠");
    }
}