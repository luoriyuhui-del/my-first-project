package com.itheima.a01interfacedemo1;

public class Rabbit extends  Animal{
    //重写父类的抽象方法eat();
    @Override
    public void eat() {
        System.out.println("小兔兔吃胡萝卜");
    }

    public Rabbit() {
    }

    public Rabbit(String name, int age) {
        super(name, age);
    }
}
