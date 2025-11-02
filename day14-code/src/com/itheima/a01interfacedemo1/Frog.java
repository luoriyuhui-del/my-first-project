package com.itheima.a01interfacedemo1;

public class Frog extends Animal implements Swim{
    //重写父类的抽象方法eat();
    @Override
    public void eat() {
        System.out.println("小青蛙吃虫子");
    }
    //实现接口swim(); --- 并进行重写
    @Override
    public void swim() {
        System.out.println("小青蛙会蛙泳");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
