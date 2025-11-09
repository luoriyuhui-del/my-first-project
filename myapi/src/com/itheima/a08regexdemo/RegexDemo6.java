package com.itheima.a08regexdemo;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexDemo6 {
    public static void main(String[] args) {
        //  -------------------------------- 正则表达式 : 爬虫 --------------------------------

         /* 有如下文本，请按照要求爬取数据。
                Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，
                因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台
                要求:找出里面所有的JavaXX
         */

        String str = "Java自从95年问世以来，经历了很多版本，目前企业中用的最多的是Java8和Java11，" +
                "因为这两个是长期支持版本，下一个长期支持版本是Java17，相信在未来不久Java17也会逐渐登上历史舞台";

        // 1 -- 创建正则表达式 : 编写规则
        String regex1 = "Java\\d{0,2}";
        // 2 -- 获取正则表达式的对象  注意 : Pattern不可以直接new出来 , 需要调用静态方法 compile
        Pattern p = Pattern.compile(regex1);
        //也可以将 1 2 合并
        //Pattern p1 = Pattern.compile("Java\\d{0,2}");

        //3 -- 获取匹配器对象
        // m 拿着规则 p 去文本str里面寻找匹配的内容
        Matcher m = p.matcher(str);

        StringBuilder sb = new StringBuilder();

        //应为我们也不清楚在文本中有几个符合的规则的内容，所以用while循环
        //    -- 循环条件为匹配成功 ( 调用 find()方法 -- 匹配成功返回true, 匹配失败返回false )
        while(m.find()){
            //m.group()方法 : 根据find()方法返回的索引，截取子串
            //   返回字符串 -- 匹配到的子串
            System.out.println(m.group());
            sb.append(m.group());
            sb.append(" ");
        }
        System.out.println(sb);

        /*拿着文本匹配器从头开始读取，寻找是否有满足规则的子串
        如果没有，方法返回false
        如果有，返回true。在底层记录子串的起始索引和结束索引+1
         0,4
        boolean b = m.find();

        方法底层会根据find方法记录的索引进行字符串的截取
         substring(起始索引，结束索引);包头不包尾
         (0,4)但是不包含4索引
         会把截取的小串进行返回。
        String s1 = m.group();
        System.out.println(s1);


        第二次在调用find的时候，会继续读取后面的内容
        读取到第二个满足要求的子串，方法会继续返回true
        并把第二个子串的起始索引和结束索引+1，进行记录
        b = m.find();

        第二次调用group方法的时候，会根据find方法记录的索引再次截取子串
        String s2 = m.group();
        System.out.println(s2);*/
    }
}
