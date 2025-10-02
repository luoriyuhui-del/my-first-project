package text;

import java.util.Scanner;

public class text08 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数:");
        int num = sc.nextInt();
        int i = 0 , num1 = 0, num2 = 0 , num3 = 0 , num4 = 0 , number = 0 ;
        number = num ;
        while( number != 0 ){
            number =  number / 10 ;
            i++;
        }
        System.out.println("num是" + i + "位数");
        boolean text = false ;
        switch( i ){
            case 2:
                num1 = num % 10 ;
                num2 = num / 10 ;
                text = (num1 == num2) ;
                break;
            case 3:
                num1 = num % 10 ;
                num3 = num / 100 ;
                text = (num1 == num3) ;
                break;
            case 4:
                num1 = num % 10 ;
                num2 = num / 10 % 10 ;
                num3 = num / 100 % 10 ;
                num4 = num / 1000 ;
                text = (num1 == num4 && num2 == num3) ;
                break;
            default:
                System.out.println("输入的数字大于4位");
                break;
        }

        if( text ){
            System.out.println( true );
        }
        else{
            System.out.println( false );
        }
    }
}
