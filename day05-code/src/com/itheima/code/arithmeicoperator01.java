package com.itheima.code;

public class arithmeicoperator01 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,4,5,6,7,8,9,10};
        int []arr2 = new int[]{0,0,0,0,0};
        int j = 0 ;
        for(int i = 0; i < arr1.length; i++) {
            if( arr1[ i ] % 2 == 0 ){
                arr1[ i ] /= 2 ;
            }
            else{
                arr1[ i ] *= 2 ;
            }
        }
        for (int i = 0; i < arr1.length; i++) {
            System.out.println(arr1[ i ]);
        }
    }
}
