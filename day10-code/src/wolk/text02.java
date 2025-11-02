package wolk;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        //调用Scanner类
        Scanner sc = new Scanner(System.in);
        //创建长度为10的数组
        int[] arr = new int[10];
        //提示：输入10个数字
        System.out.println("请输入10个数字：");
        //创建一个循环，通过键盘输入将输入的数字保存在数组中
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        //创建一个循环，将数组中的数据进行冒泡排序 --- 升序
        //外层循环，控制比较的轮数
        for (int i = 0; i < arr.length - 1; i++) {
            //内层循环，比较相邻的元素，将较大的元素交换到后面
            for (int j = 0; j < arr.length - 1 - i; j++) {
                //如果当前元素比后一个元素大，则交换位置
                if( arr[j] > arr[j + 1] ){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        //输入你要寻找的数字
        System.out.println("请输入你要寻找的数字:");
        int target = sc.nextInt();
        //创建一个循环，进行二分查找  --- 定义左右中间索引
        int left = 0;
        int right = arr.length - 1;
        //判断最终的输出条件
        boolean flag = false;
        //循环进行二分查找
        while( left <= right ){
            //计算中间索引
            int mid = (left + right) / 2;
            //判断中间索引的元素和目标元素是否相等
            if( arr[mid] == target ){
                System.out.println(target + " 在数组的第 " + mid + " 个位置");
                //找到目标元素，结束循环
                flag = true;
                break;
            }
            if( arr[mid] > target ){
                right = mid - 1;
            }else{
                left = mid + 1;
            }
        }
        //判断最终的输出条件
        if( !flag ){
            System.out.println("在该数组中未找到");
        }
    }
}
