package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo12 {
    public static void main(String[] args) {
         /*需求:
            将字符串:我要学学编编编编程程程程程程   替换为:  我要学编程
        */

        //public string replaceAll(string regex,string newStr) 按照正则表达式的规则进行替换    ---  注意 : 这个方法是将整个字符串进行替换

        String s = "我要学学编编编编程程程程程程";
        //需求:把重复的内容 替换为 单个的
        //学学                学
        //编编编编            编
        //程程程程程程        程
        //  (.)表示把重复内容的第一个字符看做一组
        //  \\1表示第一字符再次出现
        //  + 至少一次
        //  $1 表示把正则表达式中第一组的内容，再拿出来用
        //  $1 : 表示在正则表达式外面使用 正则表达式中的第一组内容
        String regex1 = "(.)\\1+";
        String newStr = s.replaceAll(regex1, "$1");//此时在字符串中已经将重复的内容替换掉了 -- 相当于重复操作替换
        System.out.println(newStr);

    }
}
