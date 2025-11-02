package com.itheima.a01interfacedemo1;

public class Text {
    public static void main(String[] args) {
        Frog f = new Frog();
        f.setName("小青");
        f.setAge(1);
        System.out.println(f.getName() + " , " + f.getAge());
        f.swim();
        f.eat();
        System.out.println("----------------------------------");

        Dog d = new Dog();
        d.setName("小黄");
        d.setAge(2);
        System.out.println(d.getName() + " , " + d.getAge());
        d.swim();
        d.eat();
        System.out.println("----------------------------------");

        Rabbit r = new Rabbit();
        r.setName("小兔子");
        r.setAge(3);
        System.out.println(r.getName() + " , " + r.getAge());
        //r.swim(); ------------ 因为rabbit没有实现swim接口，所以不能调用swim方法
        r.eat();
    }
}
