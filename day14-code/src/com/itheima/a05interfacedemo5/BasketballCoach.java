package com.itheima.a05interfacedemo5;

public class BasketballCoach extends Coach{
    @Override
    public void teach() {
        System.out.println( getName() + "篮球教练教学");
    }

    public BasketballCoach() {
    }

    public BasketballCoach(String name, int age) {
        super(name, age);
    }
}
