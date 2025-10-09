package com.itherma.code;

public class text02 {
    public static void main(String[] args) {
        //生成101--200之间的数

        int count = 0 ;
        for(int i = 101; i <= 200; i++){
            boolean sr = true ;
            for (int j = 2; j < i; j++) {
                if( i % j == 0 ){
                    sr = false ;
                    //跳出当层循环
                    break;
                }
            }
            if( sr ){
                System.out.println(i + "是素数");
                count++;
            }
        }
        System.out.println("素数的个数为" + count);
    }
}
