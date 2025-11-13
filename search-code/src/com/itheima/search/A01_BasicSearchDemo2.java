package com.itheima.search;

import java.util.ArrayList;

public class A01_BasicSearchDemo2 {
    public static void main(String[] args) {
        //课堂练习1 ： 需求：定义一个方法，实现字符串的查找功能，如果找到返回索引，如果没有找到返回-1
        // 要求 : 不考虑是否重复
        int[] arr1 = {12, 19, 55, 78, 36, 5, 23};
        int index = search1(arr1, 5);
        System.out.println("该元素在数组的第" + index + "个位置");

        //课堂练习2 ： 需求：定义一个方法，实现字符串的查找功能，如果找到返回索引，如果没有找到返回-1
        // 要求 : 考虑是否重复 , 如果重复我都要返回
        int[] arr2 = {12, 19, 55, 78, 36, 5, 23, 55};
        ArrayList<Integer> list = search2(arr2, 55);
        System.out.print("该元素在数组的第");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + "个位置 ");
        }
    }

    public static int search1(int[] arr, int number) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                return i;
            }
        }
        return -1;
    }

    public static ArrayList<Integer> search2(int[] arr, int number) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == number ){
                //如果找到 ,则将索引添加到集合中
                list.add(i);
            }
        }
        return list;
    }
}
