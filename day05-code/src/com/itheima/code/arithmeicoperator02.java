package com.itheima.code;

public class arithmeicoperator02 {
    public static void main(String[] args) {
        int arr [] = {1,2,3,4,50,6,7,8,9,10};
        int count = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( count < arr[i]){
                count = arr[i];
            }
        }
        System.out.println(count);
    }
}
