package com.itheima.a08regexdemo;

public class RegexDemo11 {
    public static void main(String[] args) {
        // ---------------------------------- 正则表达式 - 分组 - 的使用 ----------------------------------
        //  从左边往右边起 : 第一个遇到的左括号就是第一组 , 依次递增 -- 只判断左括号

        //需求1:判断一个字符串的开始字符和结束字符是否一致?只考虑一个字符
        //举例: a123a b456b 17891 &abc& a123b(false)
        // (.) : 匹配任意一个字符并进行了分组  /  .+ : 匹配任意一个字符   /  \\1 : 匹配第一个分组的内容
        String regex1 = "(.).+\\1";//判断最后的字符是否与第一组的内容匹配
        System.out.println("a123a".matches(regex1));//true
        System.out.println("b456b".matches(regex1));//true
        System.out.println("17891".matches(regex1));//true
        System.out.println("&abc&".matches(regex1));//true
        System.out.println("a123b".matches(regex1));//false
        System.out.println("=====================================================");

        //需求2:判断一个字符串的开始部分和结束部分是否一致?可以有多个字符
        //举例: abc123abc b456b 123789123 &!@abc&!@ abc123abd(false)  --  这里以三个字符为一组
        String regex2 = "(.+).+\\1";
        System.out.println("abc123abc".matches(regex2));//true
        System.out.println("b456b".matches(regex2));
        System.out.println("123789123".matches(regex2));
        System.out.println("&!@abc&!@".matches(regex2));
        System.out.println("abc123abd".matches(regex2));
        System.out.println("aaabbb2198aaabbb".matches(regex2));
        System.out.println("=====================================================");

        //需求3:判断一个字符串的开始部分和结束部分是否一致?开始部分内部每个字符也需要一致
        //举例: aaa123aaa bbb456bbb 111789111 &&abc&&
        String regex3 = "((.)\\2*).+\\1";
        //细节 :  -- (.) : 表示将第一个字符分为一组
        //     \\2 : 就是第一个字符的 内容 (2组)
        //     \\2* : 表示将第一个字符的 内容重复0次或者多次
        //     ((.)\2*) : 表示第一组
        System.out.println("aaa123aaa".matches(regex3));
        System.out.println("abb456bbb".matches(regex3));
        System.out.println("111789111".matches(regex3));
        System.out.println("&&abc&&".matches(regex3));

    }
}
