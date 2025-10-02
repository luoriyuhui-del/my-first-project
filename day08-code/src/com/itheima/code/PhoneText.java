package com.itheima.code;

public class PhoneText {
    public static void main(String[] args) {
        phone p = new phone();

        p.brand = "苹果";
        p.price = 8888.8;

        System.out.println(p.brand);
        System.out.println(p.price);

        p.call();
        p.playGame();
    }
}
