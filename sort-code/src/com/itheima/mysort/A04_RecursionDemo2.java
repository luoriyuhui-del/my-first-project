package com.itheima.mysort;

public class A04_RecursionDemo2 {
    public static void main(String[] args) {
        // ------------------------------- 递归思路 -------------------------------
        // 1. 找规律  2. 找出口

        //5!
        // 5 * 4!
        // 4 * 3!
        // 3 * 2!
        // 2 * 1!
        // 1
        int result = factorial(5);
        System.out.println(result);
    }

    private static int factorial(int number) {
        if( number == 1 ){
            return 1;
        }
        return (number * factorial(number - 1));
    }
}
