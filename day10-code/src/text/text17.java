package text;

import java.util.Scanner;

public class text17 {
    public static void main(String[] args) {
        // ---------------- 使用StringBuilder 的场景 --------------------
        //--------1.需要进行字符串拼接时 ------------
        //--------2.需要进行字符串反转时 ------------

        //判断该字符串是否是对称字符串
        //1.键盘录入字符串
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();

        //2.反转键盘录入的字符串
        String result = new StringBuilder().append(str).reverse().toString();//使用了链式编程创建
        //---------- 一个StringBuilder对象 , 然后通过append()方法将str添加到StringBuilder对象中 ,
        // ---------- 再然后通过reverse()方法将StringBuilder对象反转 ,
        // ----------- 最后通过toString()方法将反转后的StringBuilder对象转换成字符串
        if( str.equals(result) ){
            System.out.println("该字符串是对称字符串");
        }else{
            System.out.println("该字符串不是对称字符串");
        }
    }

}
