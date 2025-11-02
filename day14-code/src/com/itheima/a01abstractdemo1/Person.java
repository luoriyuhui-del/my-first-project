package com.itheima.a01abstractdemo1;

public abstract class Person {
    //当类中有抽象方法，那么这个类必须声明为抽象类 --- 抽象类：抽象类不能创建对象 ---- 注意抽象类不能被实例化
    //抽象方法声明格式: abstract 返回值类型 方法名(参数列表);
    //抽象方法不能有方法体
    //在Person的子类中，必须重写抽象方法 -- 不然会报错

    private String name;
    private int age;
    private char gender;
    private double height;

    //将抽象方法声明为抽象方法 --- 抽象方法没有方法体
    public abstract void habby();

    public Person(String name, int age, char gender, double height) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.height = height;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
