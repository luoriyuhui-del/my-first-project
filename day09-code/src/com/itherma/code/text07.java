package com.itherma.code;

import java.util.Random;

public class text07 {
    //新思路 可以打乱存放数据的数组 (使用随机数将数组打乱后输出)
    public static void main(String[] args) {
        Random r = new Random();
        int[] arr = {2, 588, 888, 1000, 10000};
        int count = 0;
        while (count < 5) {
            int set = r.nextInt(5);
            if (arr[set] != 0) {
                extracted(set, arr);
                count++;
            }
        }
    }

    private static void extracted(int set, int[] arr) {
        switch (set) {
            case 0 -> {
                System.out.println("恭喜你中奖了" + arr[0]);
                arr[0] = 0;
            }
            case 1 -> {
                System.out.println("恭喜你中奖了" + arr[1]);
                arr[1] = 0;
            }
            case 2 -> {
                System.out.println("恭喜你中奖了" + arr[2]);
                arr[2] = 0;
            }
            case 3 -> {
                System.out.println("恭喜你中奖了" + arr[3]);
                arr[3] = 0;
            }
            case 4 -> {
                System.out.println("恭喜你中奖了" + arr[4]);
                arr[4] = 0;
            }
        }
    }
}
