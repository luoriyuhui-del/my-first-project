package text;

import java.util.Scanner;

public class text10 {
    public static void main(String [] args){
        //定义方法 , 实现字符串反转 ---- 键盘录入字符串 , 调用方法 , 输出结果
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        String str = sc.next();

        String reverse = getReverse(str);
        System.out.println(reverse);
    }

    public static String getReverse(String str){
        String reverse = "";
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            char c = str.charAt(i);
            reverse += c;
        }
        return reverse;
    }
}
