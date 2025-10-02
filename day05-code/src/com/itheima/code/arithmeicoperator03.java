package com.itheima.code;

import java.util.Random;

public class arithmeicoperator03 {
    public static void main(String[] args) {
        Random rand = new Random();
        int j = 0 , count = 0 , x = 0 ;
        int [] arr = new int[ 10 ] ;
        for ( j = 0; j < 10; j++) {
            int i = rand.nextInt(100) + 1 ;
            arr[ j ] =  i ;
        }
        for (int i = 0; i < arr.length; i++) {
            count += arr[ i ] ;
            //System.out.println( arr[ i ] );
        }
        double num = count / arr.length ;
        System.out.println( "arr数组的总和为" + count);
        System.out.println( "arr数组的平均数为" + num );
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] < num ){
                System.out.println( arr[i] );
                x++;
            }
        }
        System.out.println( "arr数组小于平均数的个数为" + x );
    }
}
