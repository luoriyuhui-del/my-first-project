package com.itheima.a01abstractdemo1;

public class Text {
    public static void main(String[] args) {
        // ------------------------ 抽象类与抽象方法 ------------------------
        GirlFriend gf = new GirlFriend("小兔兔" , 23 , '女' ,165);
        System.out.println(gf.getName() + " , " + gf.getAge() + " , " + gf.getHeight() + " , " + gf.getGender());
        gf.habby();

        //Person p = new Person(); ---- 抽象类无法实例化 创建对象
    }
}
