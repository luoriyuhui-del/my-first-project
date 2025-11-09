package com.itheima.a01systemdemo;

public class SystemDemo1 {
    public static void main(String[] args) {
        // ------------------- system类中的方法 currentTimeMillis() ------------------

        // 获取当前时间 ----- 时间原点1970年1月1日0时0分0秒
        // System.currentTimeMillis() 返回时间原点到当前时间之间的毫秒数
        long time = System.currentTimeMillis();
        System.out.println(time);

        System.out.println("-------------");

        for( int i = 1 ; i < 100000 ; i++){
            for( int j = 2 ; j < Math.sqrt(i)  ; j++){
                if( i % j == 0 ){
                    System.out.println(i);
                }
            }
        }

        long time1 = System.currentTimeMillis();
        System.out.println(time1 - time);//耗时1273毫秒
    }
}
