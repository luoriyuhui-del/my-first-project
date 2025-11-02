package com.itheima.a01abstractdemo1;

public class GirlFriend extends   Person{
    public GirlFriend(String name, int age, char gender, double height) {
        super(name, age, gender, height);
    }

    public GirlFriend() {
    }

    // 重写父类的抽象方法
    @Override
    public void habby() {
        System.out.println("超喜欢吃 哈哈哈哈");
    }
}
