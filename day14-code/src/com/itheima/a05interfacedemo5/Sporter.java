package com.itheima.a05interfacedemo5;

public abstract class Sporter extends  Person{
    //抽象方法 ---- 学习运动
    public abstract void Sport();

    public Sporter() {
    }

    public Sporter(String name, int age) {
        super(name, age);
    }
}
