package com.itheima.code;

import java.util.Scanner;

public class text04 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] arr = new int[6];
    int num = 0;
    System.out.println("请输入6个评委的分数,分值在0--100:");
    for (int i = 0; i < arr.length; i++) {
        while (true) {
            if (sc.hasNextInt()) {
                int score = sc.nextInt();
                if (score >= 0 && score <= 100) {
                    arr[i] = score;
                    num += arr[i];
                    break;
                } else {
                    System.out.println("分数必须在0到100之间，请重新输入:");
                }
            } else {
                System.out.println("请输入有效的整数:");
                sc.next(); // 清除无效输入
            }
        }
    }
    int sum = math(arr, num); // 总分

    System.out.println("去掉一个最高分和最低分后的平均分是:" + (double) sum / (arr.length - 2));
}


    //定义方法去掉最高位和最低位然后返回总和
public static int math(int[] arr, int initialValue) {
    if (arr == null || arr.length < 2) {
        throw new IllegalArgumentException("数组必须至少包含两个元素");
    }

    int min = arr[0];
    int max = arr[0];

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] > max) {
            max = arr[i];
        } else if (arr[i] < min) {
            min = arr[i];
        }
    }

    return initialValue - max - min;
}

}
