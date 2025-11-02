package com.itheima.a02interfacedemo2;

public class Text {
    public static void main(String[] args) {
        //测试类

        // ------------------------ 接口中的成员特点 -------------------------
        // 1. 接口中的成员变量是常量，不能被修改 --  ( 默认修饰符 : public static final)
        // 2. 接口中的成员方法，是抽象方法，不能有方法体 -- ( 默认修饰符 : public abstract )
        // 3. 接口中不能创建对象
        // 4. 接口中没有构造方法

        InterImpl li = new InterImpl();
        //li.a = 10; --- 在接口中的成员变量是常量，不能被修改 ( 默认修饰符 : public static final)
        li.show();
    }
}
