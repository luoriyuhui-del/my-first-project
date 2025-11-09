package com.itheima.a04objectdemo;

import com.google.gson.Gson;

public class ObjectDemo4 {
    public static void main(String[] args) throws CloneNotSupportedException {
        //protected Object clone(int  a ) throws CloneNotSupportedException        对象克隆

        //创建一个friend数组
        String[] friends =  {"张三","李四","王五"};

        //新建User对象
        User u1 = new User("张三",18,'男',friends);

        //调用clone方法  :  注意不能直接调用clone方法 --- 需要在子类中重写clone方法  /  并且需要在子类中声明clone方法为public
        // ---  /  并调用接口Cloneable
        // 在Object类中clone默认是浅拷贝   --
        //    ----    浅拷贝 : 创建新的对象，并把属性值复制给新的对象   -
        //                 -- 基本数据类型直接拷贝 /  引用数据类型吧地址值拷贝过去  /  字符串直接调用字符串池中的地址值拷贝过去
        //  通常情况下 , 因为引用数据类型是浅拷贝( 地址值 ) , 两个对象指向同一个地址值 :  表示两个对象中的属性值会相互影响
        User u2 = (User) u1.clone();




        //  深拷贝就不会用以上的缺点    ---   深拷贝 : 重写clone方法  /  并调用接口Cloneable
        //    ----    深拷贝 : 创建新的对象   -
        //           -- 基本数据类型直接拷贝 / 字符串直接调用字符串池中的地址值拷贝过去 /  引用数据类型创建新的对象，并把拷贝的对象中的值赋给新的对象

        //以后一般会用第三方工具进行克隆
        //1.第三方写的代码导入到项目中
        //2.编写代码
        //Gson gson =new Gson();
        //把对象变成一个字符串
        //String s=gson.toJson(u1);
        //再把字符串变回对象就可以了
        //User user =gson.fromJson(s, User.class);   ---  相当于把类转换成字符串内容 , 再拷贝到新建对象中 , 这样就不会关联两个对象
        Gson gson =new Gson();
        String s =gson.toJson(u1);
        User u3 =gson.fromJson(s, User.class);

        friends[0] = "lin";
        System.out.println(u1);
        System.out.println(u2);
        System.out.println(u3);



    }
}
