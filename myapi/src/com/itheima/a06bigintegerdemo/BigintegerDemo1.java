package com.itheima.a06bigintegerdemo;

import java.math.BigInteger;
import java.util.Random;

public class BigintegerDemo1 {
    public static void main(String[] args) {
        // -------------------------  Biginteger类  -------------------------
        // BigInteger类 :  表示一个非常大的整数 , 可以进行任意精度的运算
        //为什么会有BigInteger类 :  byte short int  long  都是有精度限制的
        // 获取比较大的整数 就需要使用到BigInteger类  可以 "负的无限到正的无限的整数"
        //  但是不可以是小数 , 必须是整数

        //为什么Biginteger类能存储这么大的整数呢？ -- 底层实现原理 : 是底层使用long[]数组保存数据 ,
        //  --- 从右边起往左边每隔32二进制为存为一个十进制的数字保存到数组中  ,   还有一个变量专门存储Biginteger对象的正负值

         /*
            前置构造方法：
            1 - public BigInteger(int num, Random rnd) 获取随机大整数，范围:[0~ 2的num次方-11
            2 - public BigInteger(String val) 获取指定的大整数
            3 - public BigInteger(String val, int radix) 获取指定进制的大整数

            静态方法：
            public static BigInteger valueOf(long val) 静态方法获取BigInteger的对象，内部有优化

            细节:
            对象一旦创建里面的数据不能发生改变。
        */

        //1 - 获取一个随机大的整数
        /*Random r = new Random(); -- 先获取到随机数再创建对象
        BigInteger bd1 = new BigInteger(4, r);//表示获取0 到 2的4次方 之间的一位随机数
        System.out.println(bd1);*/

        //2.获取一个指定的大整数，可以超出long的取值范围
        //细节:字符串中必须是整数，否则会报错
        /*-
           BigInteger bd2 = new BigInteger("88888888888888");
            System.out.println(bd2);
         */

        /* BigInteger bd2 = new BigInteger("1.1"); -- 小数会报错
            System.out.println(bd2);
        */

        /*
            BigInteger bd3 = new BigInteger("abc"); -- 字符串中必须是整数，否则会报错
            System.out.println(bd3);
         */

        //3.获取指定进制的大整数
        //细节:
        //1.字符串中的数字必须是整数
        //2.字符串中的数字必须要跟进制吻合。
        //比如二进制中，那么只能写0和1，写其他的就报错。
        /*-
            BigInteger bd4 = new BigInteger("100", 10);//表示10进制的100
            System.out.println(bd4);
            BigInteger bd5 = new BigInteger("0100", 2);//表示2进制的0100 - 4
            System.out.println(bd5);
        */

        //4.静态方法获取BigInteger的对象，内部有优化
        //细节:
        //1.能表示范围比较小，只能在long的取值范围之内，如果超出long的范围就不行了。
        //2.在内部对常用的数字: -16 ~ 16 进行了优化。
        //  提前把-16~16 先创建好BigInteger的对象，如果多次获取不会重新创建新的。
        BigInteger bd5 = BigInteger.valueOf(16);
        BigInteger bd6 = BigInteger.valueOf(16);
        System.out.println(bd5 == bd6);//判断是不是同一个地址值( 对象 ) true

        //在数字16以后就不会再优化
        BigInteger bd7 = BigInteger.valueOf(17);
        BigInteger bd8 = BigInteger.valueOf(17);
        System.out.println(bd7 == bd8);//判断是不是同一个地址值( 对象 )  false

        //5. 当Biginteger对象中的数据进行运算的时候 ，不会改变原有对象的值 , 而是会创建新的Biginteger对象
        BigInteger bd9 = BigInteger.valueOf(1);
        BigInteger bd10 = BigInteger.valueOf(2);
        BigInteger result = bd9.add(bd10);
        System.out.println(result);// 表示 1 + 2 = 3
        System.out.println(bd9 == result );//false -- 表示对象是新创建的
        System.out.println(bd10 == result);//false -- 表示对象是新创建的
    }
}
