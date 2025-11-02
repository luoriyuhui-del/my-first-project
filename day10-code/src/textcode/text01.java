package textcode;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        //键盘录入一个字符串 要求 : 1 . 字符串长度小于等于9  2 . 只能是数字
        //1 . 对第一个条件 : 使用length()方法求得字符串长度 , 再使用if语句判断
        //2 . 对第二个条件 : 使用循环依次调用charAt()方法获取字符串中每一个字符 ,
        // ---------  然后对比每一个字符的ASCII码值是否符合 0 ~ 9 ( 48 ~ 57 )的范围
        Scanner sc =  new Scanner(System.in);

        String str = "";
        System.out.println("请输入一个字符串 -- 字符串长度小于10  且输入只能为数字 ：");
        while( true ){
            str = sc.next();
            if( get1(str) && get(str)){
                break;
            }else{
                System.out.println("输入错误 , 请重新输入 : ");
            }
        }
        String result = get2(str);
        System.out.println(result);
    }

    public static String get2(String str){
        String result = "";
        String[] result2 = {" " , "Ⅰ" , "Ⅱ" , "Ⅲ" , "Ⅳ" , "Ⅴ" , "Ⅵ" , "Ⅶ" , "Ⅷ" , "Ⅸ"};
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            int num = c - '0';
            result = result + result2[num];
        }
        return result;
    }

    // 判断字符串长度是否小于10且不为 空
    public static boolean get1(String str){
        boolean flag = true ;
        int num = str.length();
        if( num > 9 || num == 0 ){
            System.out.println("字符串长度输入错误");
            flag = false ;
        }
        return flag;
    }

    // 判断字符串是否为数字
    public static boolean get(String str){
        boolean flag = true ;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if( c < '0' || c > '9' ){
                flag = false ;
                break;
            }
        }
        return flag ;
    }
}
