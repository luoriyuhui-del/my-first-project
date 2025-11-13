package com.itheima.a04Text;

public class A03_Text3 {
    public static void main(String[] args) {
         /*
            定义一个方法自己实现toBinaryString方法的效果，将一个十进制整数转成字符串表示的二进制
         */
        System.out.println(tobinarystring(8));

        // 调用Integer类中的方法 , 获取二进制字符串
        System.out.println(Integer.toBinaryString(8));
    }

    public static String tobinarystring(int number) {//6
        //核心逻辑:
        //不断的去除以2，得到余数，一直到商为0就结束。
        //还需要把余数倒着拼接起来

        //定义一个StringBuilder用来拼接余数
        StringBuilder sb = new StringBuilder();
        //利用循环不断的除以2获取余数
        while (true) {
            if (number == 0) {
                break;
            }
            //获取余数 %
            int num = number % 2;//倒着拼接
            //sb.insert(0, num); : 插入到索引0的位置   ----  也可以反转拼接
            sb.insert(0, num);
            //除以2 /
            number = number / 2;
        }
        return sb.toString();
    }
}
