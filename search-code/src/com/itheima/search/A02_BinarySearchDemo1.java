package com.itheima.search;

import java.util.Scanner;

public class A02_BinarySearchDemo1 {
    public static void main(String[] args) {
        // ---------------------- 二分查找/折半查找 ----------------------
        //核心：
        //每次排除一半的查找范围

        //需求：定义一个方法利用二分查找，查询某个元素在数组中的索引
        //数据如下：{7, 23, 79, 81, 103, 127, 131, 147}

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要查询的元素：");
        int value = sc.nextInt();
        int[] arr = {7, 23, 79, 81, 103, 127, 131, 147};
        int index = binarySearch(arr, value);
        if(index == -1){
            System.out.println("没有找到");
        }else{
            System.out.println(value + "在数组的第" + index + "位置");
        }
    }

    // 二分查找
    public static int binarySearch(int[] arr, int value) {
        int min = 0 ;
        int max = 0;
        for (min = 0 , max = arr.length - 1 ; min <= max ; ) {
            int mid = (min + max) / 2;
            if( arr[mid] == value ){
                return mid;
            }else if( arr[mid] > value ){
                max = mid - 1;
            }else{
                min = mid + 1;
            }
        }
        return -1;
    }
}
