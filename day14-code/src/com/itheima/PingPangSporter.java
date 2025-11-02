package com.itheima;

import com.itheima.a05interfacedemo5.English;
import com.itheima.a05interfacedemo5.Sporter;

public class PingPangSporter extends Sporter implements English {
    @Override
    public void speakEnglish() {
        System.out.println( getName()  + "乒乓球运动员正在学习英语");
    }

    @Override
    public void Sport() {
        System.out.println( getName()  + "乒乓球运动员正在练习乒乓球");
    }

    public PingPangSporter() {
    }

    public PingPangSporter(String name, int age) {
        super(name, age);
    }
}
