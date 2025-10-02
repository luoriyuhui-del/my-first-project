package text;

import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数");
        int num = sc.nextInt();

        System.out.println( "num是" + math( num ) + "位数");
    }

    // 计算整数 num 的位数
public static int math(int num ){
    // 处理 num 为 0 的特殊情况
    if (num == 0) {
        return 1;
    }

    int count = 0;
    while( num != 0 ){
       num /= 10;
       count++;
    }
    return count;
}

}
