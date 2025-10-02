package com.itheima.text;

public class text06 {
    public static void main(String[] args) {
        //"|"的使用场景 只要有一个true 就为true
        //以下条件只要有一个就可以通行
        System.out.println( true | true );
        System.out.println( true | false );
        System.out.println( false | true );
        System.out.println( false | false );
    }
}
