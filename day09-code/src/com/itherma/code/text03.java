package com.itherma.code;

import java.util.Random;

public class text03 {
    //随机生成5位字符和数字 - 第一种写法
    //第二种写法思路是将大小写字母全放进一个数组中，然后随机生成一个数字，随机抽取
    public static void main(String[] args) {
        Random r = new Random();
        int [] arr = new int[5];
        for (int i = 0; i < 5; i++) {
            if( i < 4 ){
                int count = get();
                if(count == 1){
                    //输入的就是大写字母
                    int num1 = r.nextInt(26) + 65;
                    arr[i] = num1;
                }else{
                    //输入的就是小写字母
                    int num2 = r.nextInt(26) + 97;
                    arr[i] = num2;
                }
            }else{
                int num2 = r.nextInt(10);
                arr[i] = num2;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if( i < 4 ){
                System.out.print((char)arr[i] + " ");
            }else{
                System.out.print(arr[i] + " ");
            }
        }
    }

    public static int get(){
        Random r = new Random();
        return r.nextInt(2) ;
    }
}
