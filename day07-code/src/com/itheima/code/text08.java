package com.itheima.code;

import java.util.Random;

public class text08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = { 2, 88, 888, 1000, 8888};
        for (int i = 0; i < arr.length; i++) {
            int count = rand.nextInt(arr.length);
            int temp = arr[i];
            arr[i] = arr[count];
            arr[count] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + "元的奖金已被抽出");
        }
    }
}
