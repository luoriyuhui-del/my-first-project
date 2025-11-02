package com.itheima.a01abstractdemo1;

public abstract class Fridend extends  Person{
    //如果继承抽象父类 , 在子类中要么重写抽象父类中的抽象方法, 要么声明子类为抽象类
    //如果子类也为抽象类 , 也不能创建对象

    public Fridend(String name, int age, char gender, double height) {
        super(name, age, gender, height);
    }

    public Fridend() {
    }
}
