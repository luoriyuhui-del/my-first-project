package com.itheima.a04Text;

import java.util.ArrayList;
import java.util.Scanner;

public class A01_text1 {
    public static void main(String[] args) {
        /*
            键盘录入一些1~10日之间的整数，并添加到集合中。直到集合中所有数据和超过200为止。
        */

        //键盘录入一些1~100的整数 , 添加到集合中 , 当集合中所有的数的和超过200时停止
        ArrayList<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = 0;
        //创建变量记录集合中所有数的和
        while ( true ) {
            System.out.println("请输入1~100之间的数字:");
            String input = sc.nextLine();
            num = Integer.parseInt(input);
            if( num < 1 || num > 100){
                System.out.println("请输入有效的数字");
                continue;
            }
            //添加到集合中//细节:
            //num:基本数据类型
            //集合里面的数据是Integer
            //在添加数据的时候触发了自动装箱 : num -> Integer.valueOf(num)
            list.add(num);
            int sum = get(list);
            if(sum > 200){
                break;
            }
        }
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i) + " ");
        }
        System.out.println(list);
    }

    private static int get(ArrayList<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum = sum + list.get(i);
        }
        return sum;
    }
}
