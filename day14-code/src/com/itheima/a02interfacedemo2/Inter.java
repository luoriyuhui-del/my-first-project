package com.itheima.a02interfacedemo2;

public interface Inter {
    // 接口中声明的成员变量 --- 默认是 public static final ( 如果你不写idea也会自动加上 )
    public static final int a = 10 ;

    // 接口中声明的成员方法 --- 默认是 public abstract ( 如果你不写idea也会自动加上 )
    public abstract void show();
}
