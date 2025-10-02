package text;

import java.util.Scanner;

public class text14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int x = sc.nextInt();
        if( x % 2 == 0 || x % 3 == 0 || x % 5 == 0 || x % 7 == 0  ){
            System.out.println("不是质数");
        }
        else{
            System.out.println("是质数");
        }

    }
}
