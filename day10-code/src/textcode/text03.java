package textcode;

import java.util.Random;
import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {
        //键盘录入一个字符串 , 将其顺序打乱后输出
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        System.out.println("请键盘输入一个字符串:");
        String str = sc.next();

        char[] ch = str.toCharArray(); //--- 方法很重要 --- 将字符串转换成字符数组

        //创建一个String的数组存取字符串的每一个字符
        //char[] ch = new char[str.length()];// --- 数组长度为字符串的长度str.length()
        //遍历字符串 依次获取字符串的每一个字符到数组中
        //for (int i = 0; i < str.length(); i++) {
            //ch[i] = str.charAt(i);
        //}

        //随机打乱数组
        for (int i = 0; i < ch.length; i++) {
            int num = r.nextInt(ch.length);
            char temp = ch[i];
            ch[i] = ch[num];
            ch[num] = temp;
        }
        //创建一个StringBuilder对象 --- 对于字符串的拼接更快更省内存
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        str = sb.toString();
        System.out.println(str);
    }
}
