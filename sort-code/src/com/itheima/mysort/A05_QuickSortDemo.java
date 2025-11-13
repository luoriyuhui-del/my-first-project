package com.itheima.mysort;

import java.util.Random;

public class A05_QuickSortDemo {
    public static void main(String[] args) {
        /*
        快速排序：
            第一轮：以0索引的数字为基准数，确定基准数在数组中正确的位置。
            比基准数小的全部在左边，比基准数大的全部在右边。
            后面以此类推。
        */

        //int[] arr = {9, 3, 2, 7, 6, 1, 4, 5, 10, 8};

        int[] arr = new int[1000000];
        Random r = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt();
        }
        //  ---  测试快速排序的效率
        long start = System.currentTimeMillis();
        quickSort(arr, 0, arr.length - 1);
        long end = System.currentTimeMillis();

        System.out.println(end - start);//157

        /*-for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }*/
    }

    private static void quickSort(int[] arr, int i, int j) {
        //获取起始索引
        int startIndex = i;
        int endIndex = j;

        //退出条件 : 如果起始索引 > 结束索引，则结束循环
         if(startIndex > endIndex){
             return ;
         }

        //获取基准数索引
        int baseNumber = arr[i];

        //结束条件 : 起始索引 > 结束索引
        while (startIndex != endIndex) {
            // ---- 注意 : 在循环中 ,要优先从后往开始找 - 再从前往找 : 这样可以保证最后的移动的值是比基准数小的数字。

            //1.从右往左找比基准数大的数字 , 如果找到的数字比基准数小，则结束循环  --- 结束索引自减
            // 如果直到循环结束，startIndex > endIndex，则结束循环 -- 退出循环
            while (true) {
                if (startIndex >= endIndex || arr[endIndex] < baseNumber) {
                    break;
                }else{
                    endIndex--;
                }
            }
            //2.从左往右找比基准数小的数字 , 如果找到起始索引大于结束索引或者找到的数字比基准数大，则结束循环 -- 起始索引自增
            // 如果直到循环结束，startIndex > endIndex，则结束循环 -- 表示数组已经排序完毕
            while (true) {
                if (startIndex >= endIndex || arr[startIndex] > baseNumber) {
                    break;
                }else{
                    startIndex++;
                }
            }
            //3.交换两个数字的位置
            int temp = arr[startIndex];
            arr[startIndex] = arr[endIndex];
            arr[endIndex] = temp;
        }
        //4.交换基准数和endIndex索引的数字
        //当start和end指向了同一个元素的时候，那么上面的循环就会结束
        //表示已经找到了基准数在数组中应存入的位置
        //基准数归位
        //就是拿着这个范围中的第一个数字，跟start指向的元素进行交换
        int temp = baseNumber;
        arr[i] = arr[endIndex];
        arr[endIndex] = temp;

        //5.  ----------  递归  -----------
        //确定6左边的范围，重复刚刚所做的事情
        quickSort(arr,i,startIndex - 1);
        //确定6右边的范围，重复刚刚所做的事情
        quickSort(arr,startIndex + 1, j);
    }
}
