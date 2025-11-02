package com.itheima.a05interfacedemo5;

public abstract class Coach extends Person{
    //抽象方法 --- 教练教学
    public abstract void teach();

    public Coach() {
    }

    public Coach(String name, int age) {
        super(name, age);
    }
}
