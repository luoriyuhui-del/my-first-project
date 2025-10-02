package com.itheima;

public class arithmeicoperator05 {
    public static void main(String[] args){
        int i = 10 ;
        int j = 10 ;
        int c = i + j + (i++);
        System.out.println( c );
        System.out.println( i );

        System.out.println( i == j );
        System.out.println( i != j );
        System.out.println( i > j );
    }
}
