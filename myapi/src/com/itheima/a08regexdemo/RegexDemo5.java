package com.itheima.a08regexdemo;

public class RegexDemo5 {
    public static void main(String[] args) {
        System.out.println("===================1=====================");
        // 编写正则表达式验证用户名是否满足要求 : 大小写字母 、 数字 、 下划线 、 长度4-16位
        String regex1 = "\\w{4,16}";
        System.out.println("itheima".matches(regex1));

        System.out.println("====================2====================");
        // 编写正则表达式验证身份证是否满足要求 : 18位 、 前17位为数字 、 第18位为字母 、 验证码通过
        String regex2 = "[1-9]\\d{16}(\\d|x|X)";//  (\\d|X|x) : 表示任意一个数字或者X或者x
        String regex4 = "[1-9]\\d{16}[\\dxX]"; //  [\\dXx] : 表示任意一个数字或者X或者x
        String regex7 = "[1-9]\\d{16}(\\d|(?i)x)";
        System.out.println("10101199001011234X".matches(regex2));
        System.out.println("10101199001011234x".matches(regex4));
        System.out.println("10101199001011234X".matches(regex7));

        System.out.println("=====================3===================");
        //忽略大小写的方式 : (?i)
        String regex5 = "(?i)abc";//表示忽略abc的大小写
        String regex6 = "a((?i)b)c";//表示忽略b的大小写
        System.out.println("ABC".matches(regex5));//true
        System.out.println("aBc".matches(regex6));//true

        System.out.println("=====================4====================");
        // 编写正则表达式严格验证身份证号码 : 18位 , 前17位为数字 , 第18位为数字或X x , 出生日期为1950-2025年 月份为 1 - 12 日期为 1 - 31, 验证码通过
        //String regex3 = "\\d{4}((0[1-9])|(1[0-2]))((0[1-9])|([1-2][0-9])|(3[0-1]))\\d{3}[\\dXx]";
        String regex3 = "[1-9]\\d{5}(18|19|20)\\d{2}(0[1-9]|1[0-2])(0[1-9]|[12]\\d|3[01])\\d{3}[\\dXx]";
        System.out.println("44088120001001123X".matches(regex3));

    }
}
