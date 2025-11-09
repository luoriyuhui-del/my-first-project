package com.itheima.a08regexdemo;

public class RegexDemo10 {
    public static void main(String[] args) {
        // -------------------------------- 正则表达式中的方法 -----------------------------------

        //public boolean matches(string regex): 判断是否与正则表达式匹配，匹配返回true
        //public string replaceAll(string regex,string newStr) 按照正则表达式的规则进行替换    ---  注意 : 这个方法是将整个字符串进行替换
        //public string[] split(string regex): 按照正则表达式的规则切割字符串      --     返回值是字符串数组

        /*
            有一段字符串:小诗诗dqwefqwfqwfwq12312小丹丹dqwefqwfqwfwq12312小惠惠
            要求1:把字符串中三个姓名之间的字母替换为vs
            要求2:把字符串中的三个姓名切割出来*/


        String s = "小诗诗abjfcfhskgj12091小丹丹ishfiufne124小兔兔";

        //要求一 :
        // 把所要修改的内容替换成VS  --  [\\w&&[^_]]+表示 字母和数字的混合体出现一次或者多次
        String result1 = s.replaceAll("[\\w&&[^_]]+" , "VS");
        System.out.println(result1);

        //方法replaceAll()方法 : 在底层中是通过 --
        // Pattern.compile()方法将正则表达式编译成Pattern对象，再调用Matcher对象中的方法replaceAll()方法进行替换 , 返回新的字符串
        // 细节 : 在底层中Matcher通过Pattern规则寻找符合要求的子串，替换成指定的字符串，返回新的字符串

        //要求二 :
        // 寻找到符合"[\w&&[^_]]+"规则的字符串进行切割 , 切割后放进字符串数组中
        String[] newStrings = s.split("[\\w&&[^_]]+");
        for (String newString : newStrings) {
            System.out.println(newString);
        }
    }
}
