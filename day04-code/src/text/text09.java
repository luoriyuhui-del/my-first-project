package text;

import java.util.Scanner;

public class text09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入除数:");
        int number1 = sc.nextInt();
        System.out.println("请输入被除数:");
        int number2 = sc.nextInt();
        int count = 0 ;
        int a = number2 ;
        int b = number1 ;
        while( number2 >= number1 ){
            number2 -= number1 ;
            count++;
        }
        System.out.println(a + "除以" + b + "的商是" + count);
        System.out.println(a + "除以" + b + "的余数是" + number2);


//        int i = 0 ,count = 0 , girl = number ;
//        while( number != 0 ){
//            i = number % 10 ;
//            number /= 10 ;
//            count = count * 10 + i ;
//        }
//        if( count == girl ){
//            System.out.println("是回文数");
//        }else{
//            System.out.println("不是回文数");
//        }
    }
}
