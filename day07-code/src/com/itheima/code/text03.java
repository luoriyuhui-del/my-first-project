package com.itheima.code;

import java.util.Random;
import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {
        Random rand = new Random();
        //记录最终的验证码
        String count = "";
        char ch = ' ';
        int sum = 0 ;
        for (int i = 0; i < 5; i++) {
            int x = rand.nextInt(2);
            if( x == 0 ){
                ch = ( char)math();
                count = count + ch;
            }else{
                sum =  + rand.nextInt(10);
                count = count + sum;
            }
        }
        System.out.println("验证码为" + count);
        System.out.println("请输入验证码:");

        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        do {
            if(input.equals(count)){
                System.out.println("验证码输入正确");
                break;
            }else{
                System.out.println("验证码输入错误，请重新输入:");
                input = sc.next();
            }
        } while (true);
    }

    public static int math(){
        Random rand = new Random();
        //决定生成大写字母还是小写字母
        int number = rand.nextInt(2);
        if( number == 0){
            return rand.nextInt(26) + 'a';
        }
        else{
            return rand.nextInt(26) + 'A';
        }
    }
}
