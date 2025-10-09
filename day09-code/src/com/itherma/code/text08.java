package com.itherma.code;

import java.util.Random;
import java.util.Scanner;

public class text08 {
    public static void main(String[] args) {
        Random r = new Random();
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[7];//存放随机生成的
        int[] arr2 = new int[arr.length];//存放用户输入的
        arr = extracted(arr, r);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println("请输入你所选择六个的红球密码与一个蓝球密码");
        arr2 = extracted(arr2, sc);
        int count = 0;
        int count2 = 0;
        //----------------------------------------------------
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j != 6) {
                    if (arr2[i] == arr[j]) {
                        count++;
                        break;
                    }
                } else {
                    if (arr2[i] == arr[j]) {
                        count2++;
                    }
                }
            }
        }
        //-----------------------------------------------------
        extracted(count, count2);
    }

    private static void extracted(int count, int count2) {
        //------------------------判断你中几等奖---------------------------
        if (count == 6 && count2 == 1) {
            System.out.println("恭喜你 , 中奖1000W");
        } else if (count == 6 && count2 == 0) {
            System.out.println("恭喜你 , 中奖500W");
        } else if (count == 5 && count2 == 1) {
            System.out.println("恭喜你 , 中奖3000");
        } else if ((count == 5 && count2 == 0) || (count == 4 && count2 == 1)) {
            System.out.println("恭喜你 , 中奖200");
        } else if ((count == 4 && count2 == 0) || (count == 3 && count2 == 1)) {
            System.out.println("恭喜你 , 中奖10");
        } else if ((count == 2 && count2 == 1) || (count == 1 && count2 == 1) || (count == 0 && count2 == 1)) {
            System.out.println("恭喜你 , 中奖5");
        } else {
            System.out.println("没中奖");
        }
    }

    private static int[] extracted(int[] arr2, Scanner sc) {
        //-------------------------用户输入----------------------------------
        for (int i = 0; i < arr2.length; ) {
            int number = 0;//定义变量存取输入值 , 用于判断输入的是否符合要求1~33 / 1~16
            if (i != 6) {
                //输入用户的红球密码
                number = sc.nextInt();
                if (number >= 1 && number <= 33) {
                    if (!mash(arr2, number)) {//检查重复
                        arr2[i] = number;
                        i++;//将循环的自增放于符合的输入值条件内
                    } else {
                        System.out.println("输入重复 , 当前输入的个数为 " + i + "请重新输入1~33的数字");
                    }

                } else {
                    System.out.println("输入错误 , 当前输入的个数为 " + i + "请重新输入1~33的数字");
                }
            } else {
                //输入用户的蓝球密码
                System.out.println("请输入蓝球密码:");
                number = sc.nextInt();
                if (number >= 1 && number <= 16) {
                    arr2[i] = number;
                    i++;//将循环的自增放于符合的输入值条件内
                } else {
                    System.out.println("输入错误 , 当前输入的个数为 " + i + "请重新输入1~16的数字");
                }
            }
        }
        return arr2;
    }

    private static int[] extracted(int[] arr, Random r) {
        //-------------------------随机生成----------------------------------
        int number = 0;
        for (int i = 0; i < arr.length; ) { // 修改了循环条件，不再自动递增
            if (i != 6) {
                //红球的随机数生成
                number = r.nextInt(33) + 1;
                // 检查是否有重复，如果没有重复则赋值并递增索引
                if (!mash(arr, number)) {
                    arr[i] = number;
                    i++; // 只有在成功添加号码后才递增
                }
            } else {
                //篮球的随机数生成
                arr[i] = r.nextInt(16) + 1;
                i++; // 蓝球不需要检查重复，直接递增
            }
        }
        return arr;
    }

    public static boolean mash(int[] arr, int number) {
        //-------------------------检查重复----------------------------------
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                flag = true;
            }
        }
        return flag;
    }
}