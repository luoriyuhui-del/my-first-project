package com.itheima.a05interfacedemo5;

public class BasketballSporter extends Sporter {

    //抽象方法 --- 重写抽象方法
    @Override
    public void Sport() {
        System.out.println( getName() + "篮球运动员正在练习篮球");
    }

    public BasketballSporter() {
    }

    public BasketballSporter(String name, int age) {
        super(name, age);
    }
}
