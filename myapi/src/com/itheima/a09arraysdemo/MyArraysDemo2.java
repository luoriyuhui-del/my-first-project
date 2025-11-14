package com.itheima.a09arraysdemo;

import java.util.Arrays;
import java.util.Comparator;

public class MyArraysDemo2 {
    public static void main(String[] args) {
        /*
        * public static void sort(数组 , 排序规则)     按照指定的规则进行排序
        * 参数一 : 要排序的数组
        * 参数二 : 排序规则 ( 接口 : Comparator )
        * 细节 : 只能给引用数据类型的数组进行排序
        *        如果数组中的元素是基本数据类型，需要转换为对应的包装类
        * */

        Integer[] arr = {10, 5, 20, 40, 30 , 50 , 15 };
        //因为规则是接口 , 我们在调用的时候需要传递接口的实现类 -- 匿名内部类

        /*
        *  在sort方法中 , 是采用插入排序 + 二分查找的方式进行排序的
        *  在底层默认数组中的 0 索引是有序的 , 0 索引后面的都是无序的
        *  遍历无序数组中的元素 , 假设遍历到A元素
        *  在底层中 , 通过二分查找来确定 无序中的元素A 应该插入到有序的数组中位置
        *  通过比较 A 元素和 有序数组中二分查找的元素的大小关系   ---     重点 : 比较的规则就是Compare方法的方法体
        *  如果方法的返回值是负数 : 拿着A 继续跟前面的元素进行比较
        *  如果方法的返回值是正数 : 拿着A 继续跟后面的元素进行比较
        *  如果方法的返回值是0 : 也拿着A 继续跟着后面的元素进行比较
        *  直到能确定A的最终位置为止
        * */
        Arrays.sort(arr,new Comparator< Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                // o1 : 数组中的元素  /   o2 : 数组中o1后面的元素
                // 升序 : 01 - 02
                // 降序 : 02 - 01
                return o2 - o1;
                }
            }
        );

        System.out.println(Arrays.toString(arr));
    }
}
