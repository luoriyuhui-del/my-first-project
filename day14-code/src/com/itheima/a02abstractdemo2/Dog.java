package com.itheima.a02abstractdemo2;

public class Dog extends Animal{
    //抽象类中抽象方法必须重写
    @Override
    public void eat() {
        System.out.println("小狗吃骨头");
    }

    public Dog() {
    }

    public Dog(String name, int age) {
        super(name, age);
    }
}
