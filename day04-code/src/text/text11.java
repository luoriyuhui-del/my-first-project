package text;

import java.util.Scanner;

public class text11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个除数");
        int number = sc.nextInt();
        System.out.println("请输入一个被除数：");
        int number2 = sc.nextInt();
        int i = 1 , j = number2 ;
        while( number >= number2){
            number2 += j  ;
            i++ ;
        }
        System.out.println();
    }
}
