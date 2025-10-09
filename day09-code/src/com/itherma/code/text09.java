package com.itherma.code;

public class text09 {
    public static void main(String[] args) {
        int [][] arr = {
                {22,66,44},
                {77,33,88},
                {25,45,65},
                {11,66,99}
        };
        int[] count = new int[arr.length];
        int sun = 0 ;

        for (int i = 0; i < arr.length; i++) {
            int num = 0 ;
            for (int j = 0; j < arr[i].length ; j++) {
                num += arr[i][j];
            }
            count[i] = num;
            System.out.println("第" + (i + 1) + "季度的和为:" + count[i]);
        }
        for (int i = 0; i < count.length; i++) {
            sun += count[i];
        }
        System.out.println("所有季度的和为:" + sun);
    }
}
