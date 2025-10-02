package com.itheima.text;

public class text07 {
    public static void main(String[] args) {
        //"^"的使用场景 相同为false(0) 不同为true(1)
        //以下条件只要有一个就可以通行
        System.out.println( true ^ true );
        System.out.println( true ^ false );
        System.out.println( false ^ true );
        System.out.println( false ^ false );
    }
}
