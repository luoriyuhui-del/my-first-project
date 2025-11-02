package text;

import java.util.Scanner;

public class text04 {
    public static void main(String[] args){
        //直接赋值一个字符串变量
        String s1 = "abc";

        //NEW创建一个字符串变量
        String s2 = new String("Abc");

        //比较字符串是否相等
        System.out.println(s1 == s2);
        //输出：false -------- 此时比较的是s1的abc 和 s2的abc地址值

        //调用equals方法比较字符串是否相等( 请注意这种比较方法会区分大小写 ------ 应用与比较账号密码 )
        boolean flag = s1.equals(s2);//------------ s1调用方法比较括号中1的 内容
        System.out.println(flag);
        //输出：true ----------- 此时比较的是s1的abc 和 s2的abc内容 而不是地址值

        //调用equalsIgnoreCase方法比较字符串是否相等( 请注意这种比较方法不会区分大小写 )
        // equalsIgnoreCase
        boolean flag1 = s1.equalsIgnoreCase(s2);
        System.out.println(flag1);
        //输出：true

        Scanner sc = new Scanner(System.in);//new出来的是存放在 堆内存中 的
        System.out.println("请输入字符串：");
        String s3 = sc.next();
        boolean flag2 = s1.equals(s3);
        System.out.println( flag2 );
        //输出：true ------------ 此时比较的是s1的abc 和 s3的abc内容 而不是地址值
        System.out.println( s1 == s3);
        //输出：false ------ 此时比较的是s1的abc 和 s3的abc地址值

    }
}
