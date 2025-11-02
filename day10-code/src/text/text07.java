package text;

import java.util.Scanner;

public class text07 {
    public static void main(String[] args) {
        //输入一个字符串并遍历
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //遍历字符串 --- 遍历字符串时使用for循环快捷键为 str.length().fori
        // i为索引 , str.charAt(i)为字符 , length()是方法
        //length 作用于数组 , 不带括号 --- 是数组的属性 ; length() 作用于字符串 , 带括号 --- 是字符串的方法
        for (int i = 0; i < str.length(); i++) {
            //获取字符 , 创建字符变量接收 , str.charAt()方法是获取字符
            char c = str.charAt(i);
            System.out.print(c + " ");
        }
    }
}
