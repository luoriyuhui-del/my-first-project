package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo8 {
    public static void main(String[] args) {
        // -------------------------------- 带条件的爬取  ------------------------------
        /*
            有如下文本，按要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台


            需求1:爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
            需求2:爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
            需求3:爬取除了版本号为8，11.17的Java文本，
        */

        String s = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        //需求一 : 爬取版本号为8，11.17的Java文本，但是只要Java，不显示版本号。
        // (?=) : 表示后面跟着的要求 , 但是不会打印出来
        String regex1 = "Java(?=8|11|17)"; // 这里的 ? 表示Java 后面跟着 8 11 17 才符合
        // 打印结果为 : Java8 Java11 Java17

        //  (?i)java : 忽略java的大小写  ---  ( (?i)java ) : 表示第一个整体
        String regex2 = "((?i)java)(?=8|11|17)"; // 这里第一个的 ?i 表示忽略大小写  ,  后面的 ?= 表示前面括号里面的内容


        //需求二 : 爬取版本号为8，11，17的Java文本。正确爬取结果为:Java8 Java11 Java17 Java17
        // (?:) : 表示非捕获的括号  ---  它会打印Java后面的数字 与 "?=" 不同
        String regex3 = "Java(?:8|11|17)";
        //打印结果 : Java8 Java11 Java17 Java17


        //需求三 : 爬取除了版本号为8，11.17的Java文本。
        // (?!) : 表示排除指定的要求
        String regex4 = "Java(?!8|11|17)";
        //打印结果 : Java

        //爬取流程
        Pattern p = Pattern.compile(regex4);
        Matcher m = p.matcher(s);
        while(m.find()){
            System.out.println(m.group());
        }
    }
}
