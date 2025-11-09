package com.itheima.a04objectdemo;

import java.util.Objects;

public class Student {
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
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

    //重写Object类中的equals()方法
    @Override
    public boolean equals(Object o) {
        //判断两个对象是否相等 判断两个对象是否是同一个对象
        if (o == null || getClass() != o.getClass()) return false;
        //强转
        Student student = (Student) o;
        return age == student.age && Objects.equals(name, student.name);
    }


    //重写Object类中的toString()方法
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
