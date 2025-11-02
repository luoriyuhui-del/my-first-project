package com.itheima.a05interfacedemo5;

public class PingPangCoach extends  Coach implements English{
    @Override
    public void teach() {
        System.out.println(getName() + "乒乓球教练教学");
    }

    @Override
    public void speakEnglish() {
        System.out.println(getName() + "乒乓球教练正在学习英语");
    }

    public PingPangCoach() {
    }

    public PingPangCoach(String name, int age) {
        super(name, age);
    }
}
