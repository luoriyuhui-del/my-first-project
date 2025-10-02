package com.itheima.code;

import java.util.Scanner;

public class arithmeicoperator02 {
    public static void main(String[] args)
        {
//            int number = 10 ;
//            switch( number){
//                case 10  -> System.out.println("今天是星期一");
//                case 11  -> System.out.println("今天是星期二");
//                case 12  -> System.out.println("今天是星期三");
//                case 13  -> System.out.println("今天是星期四");
//                default  -> System.out.println("今天是周末");
//            }

            Scanner sc = new Scanner(System.in);
            System.out.println("请输入你坚持了多久:");
            int num1 = sc.nextInt();
            switch( num1 ){
                case 1 , 4 -> System.out.println("你坚持了1天");
                case 2 -> System.out.println("你坚持了2天");
                case 3 -> System.out.println("你坚持了3天");
            }
        }
}
