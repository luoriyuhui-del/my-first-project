package com.itheima.a09arraysdemo;

import java.util.Arrays;

public class MyArraysDemo1 {
    public static void main(String[] args) {
        // -------------------------------------- Arrays : 类 -----------------------------------------

        /*
         * public static String toString(数组)                          把数组拼接成一个字符串
         * public static int binarySearch(数组, 查找值)                  二分查找查找指定值
         * public static int[] copyOf(数组, 新数组的长度)                 拷贝数组
         * public static int[] copyOfRange(数组, 开始索引, 结束索引)      拷贝数组(指定范围)
         * public static int fill(数组, 填充值)                          填充数组
         * public static void sort(数组)                                 采用默认的方式对数组进行排序
         * public static void sort(数组, 排序规则)                       采用指定的规则对数组进行排序
         * */

        // toString : 将数组变成字符串
        System.out.println("-------------------------- toString ------------------------");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        String s = Arrays.toString(arr);
        System.out.println(s);

        // binarySearch : 二分查找查找元素
        //细节一 : 数组必须是有序的 , 并且是升序
        //细节二 : 如果数组查找的元素是存在的 , 则返回元素的索引值
        //细节三 : 如果数组查找的元素是不存在的 , 则返回 - (插入点) - 1  ,  为什么呢？ 因为返回是索引是-0 , 就会冲突
        System.out.println("-------------------------- binarySearch ------------------------");
        System.out.println(Arrays.binarySearch(arr, 5));
        System.out.println(Arrays.binarySearch(arr, 11));// 11在10的后面 , 插入点是10的索引 所以是 -10 - 1 = -11
        System.out.println(Arrays.binarySearch(arr, 1));

        // copyOf : 拷贝数组
        // 参数一 : 源数组   /    参数二 : 新数组的长度
        // 在方法的底层会根据第二个参数长度创建一个新数组 , 然后将源数组中的元素拷贝到新数组中
        // 如果新数组的长度比源数组的长度小 , 则只会拷贝新数组的长度个元素
        // 如果新数组的长度比源数组的长度大 , 则会用0填充新数组的剩余元素( int类型填充默认是0 )
        System.out.println("-------------------------- copyOf ------------------------");
        int[] arr1 = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(arr1));

        // copyOfRange : 拷贝数组(指定范围)
        // 细节 : 包头不包尾 , 包左不包右
        System.out.println("-------------------------- copyOfRange ------------------------");
        int[] arr2 = Arrays.copyOfRange(arr, 2, 20);
        System.out.println(Arrays.toString(arr2));

        // fill : 填充数组
        System.out.println("-------------------------- fill ------------------------");
        Arrays.fill(arr, 100);
        System.out.println(Arrays.toString(arr));

        // sort : 排序数组 , 默认情况下 , 给基本类型排序是升序排序 , 底层使用的是快速排序
        System.out.println("-------------------------- sort ------------------------");
        int[] arr3 = {8, 5, 9, 2, 3, 4, 1, 7, 6, 10};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}
