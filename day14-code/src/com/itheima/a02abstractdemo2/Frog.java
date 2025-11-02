package com.itheima.a02abstractdemo2;

public class Frog extends Animal{
    // 抽象方法重写
    @Override
    public void eat() {
        System.out.println("青蛙吃虫子");
    }

    public Frog() {
    }

    public Frog(String name, int age) {
        super(name, age);
    }
}
