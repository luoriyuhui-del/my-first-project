package text;
import java.util.Scanner;//第一步 : 导包----Scanner 属于 java.util 包

public class text01 {
    public static void main(String[] args) {
        //第二步 : 创建对象---------调用类方法创建对象
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个小数:");
        double a = sc.nextDouble();
        System.out.println("小数为" + a );
    }
}
