package com.itheima.a02interfacedemo2;

public class InterImpl implements  Inter{
    //javaBean类

    @Override
    public void show() {
        System.out.println("show方法正在执行...");
    }

    //无参构造 方法
    public InterImpl() {
    }

}
