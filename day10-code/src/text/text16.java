package text;

import java.util.Scanner;

public class text16 {
    public static void main(String[] args) {
        //链式编程
        //当我们在调用一个方法的时候, 如果这个方法返回的是一个对象
        // ( 且不需要用变量接收他的结果 ), 那么我们就可以继续调用这个对象的方法
        int len = getString().substring(1).replace("a", "*").length();//套娃
        System.out.println(len);

    }

    public static String getString(){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        return str;
    }
}
