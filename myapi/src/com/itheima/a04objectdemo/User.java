package com.itheima.a04objectdemo;

public class User implements Cloneable{
    //属性 : 姓名 年龄 性别
    private String name;
    private int age;
    private char grade;
    private String[] friends;

    public String[] getFriends() {
        return friends;
    }

    public void setFriends(String[] friends) {
        this.friends = friends;
    }

    public User() {
    }
    public User(String name, int age, char grade , String[] friends) {
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.friends = friends;
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

    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    //方法 : 获取信息    ---  重写 toString()
    @Override
    public String toString() {
        return name + " ,  " + age + " ,  " + grade + " ,  " + getFriendsInfo(friends);
    }

    //定义一个方法 , 将friends的值拼接成字符串
    public String getFriendsInfo(String[] friends){
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < friends.length; i++) {
            sb.append(friends[i]);
        }
        return sb.toString();
    }

    //方法 : 判断两个对象是否相等   --- 重写 equals()
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        User user = (User) obj;
        return age == user.age && name.equals(user.name) && grade == user.grade;
        /*
        if (obj instanceof User) {
            User user = (User) obj;
            return age == user.age && name.equals(user.name) && grade == user.grade;
        } else {
            return false;
        }
         */
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
