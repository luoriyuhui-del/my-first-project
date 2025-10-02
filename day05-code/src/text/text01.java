package text;

import java.util.Random;
import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int num1 = sc.nextInt();

        Random rand = new Random();
        int num2 = rand.nextInt(100);

        for (int i = 0; i < 101; i++) {
            if( num2 % num1 == i  ){
                System.out.println(num2 + " % " + num1 + " = " + i);
            }
        }
    }
}
