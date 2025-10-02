package com.itheima.code;

import java.util.Scanner;

public class arithmeicoperator01 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你坚持了多久:");int num1 = sc.nextInt();
        if( num1 >= 20  )
        {
            System.out.println( "你是个猛男" );
        }
        else if ( num1 >= 10 )
        {
            System.out.println( "你硬飞了" );
        }
        else
        {
            System.out.println( "你太菜了");
        }
    }
}
