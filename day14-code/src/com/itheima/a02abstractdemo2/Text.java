package com.itheima.a02abstractdemo2;

public class Text {
    public static void main(String[] args) {
        //创建小狗对象
        Animal a = new Dog("小黄",2);
        System.out.println(a.getName() + " " + a.getAge() + "岁");
        a.eat();
        a.drink();

        System.out.println("--------------------------------");

        Animal b = new Frog("小青",1);
        System.out.println(b.getName() + " " + b.getAge()  + "岁");
        b.eat();
        b.drink();

        System.out.println("--------------------------------");

        Animal c = new Sheep("懒洋洋大王",1);
        System.out.println(c.getName() + " " + c.getAge()  + "岁");
        c.eat();
        c.drink();

        System.out.println("--------------------------------");
    }
}
