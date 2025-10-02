package com.itheima.code;

import java.util.Random;

public class arithmeicoperator05 {
    public static void main(String[] args)
    {
        int arr[] = { 1,2,3,4,5};
        int j = 0 ;
        int x = 0 ;
        Random rand = new Random();

        for (int i = 0; i < arr.length; i++) {
            x = rand.nextInt(4);
            j = arr[x];
            arr[x] = arr[i];
            arr[i] = j;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] + " ");
        }
    }
}
