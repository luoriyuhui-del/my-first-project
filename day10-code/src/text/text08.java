package text;

import java.util.Scanner;

public class text08 {
    public static void main(String[] args) {
        //输入一个字符串并遍历 --- 判断字符串中 大写字母 小写字母 数字的个数 并打印
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //新建统计变量分别统计大写字母 小写字母 数字 的个数
        int bigCount = 0;
        int smallCount = 0;
        int numberCount = 0;

        //遍历字符串
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if( c >= 'A' && c <= 'Z' ){
                //判断大写字母 , 直接使用字符进行对比 , 因为字符会在 ASCII 中有顺序 , 转化为int类型对比
                bigCount++;
            }else if( c >= 'a' && c <= 'z' ){
                //判断小写字母 , 直接使用字符进行对比 , 因为字符会在 ASCII 中有顺序 , 转化为int类型对比
                smallCount++;
            }else if( c >= '0' && c <= '9' ){
                //判断数字 , 直接使用字符进行对比 , 因为字符会在 ASCII 中有顺序 , 转化为int类型对比
                // 数字0 ~ 9 的ASCII码范围是 48 ~ 57
                numberCount++;
            }
            // else{
            //     //其他字符
            // }
        }

        System.out.println("大写字母的个数：" + bigCount);
        System.out.println("小写字母的个数：" + smallCount);
        System.out.println("数字的个数：" + numberCount);
    }
}
