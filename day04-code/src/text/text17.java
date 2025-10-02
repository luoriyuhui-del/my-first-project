package text;

import java.util.Scanner;

public class text17 {
    public static void main(String[] args) {
        //----------------回文数练习-------------------
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你选择的回文数:");
        int num1 = sc.nextInt();
        int num2 = 0 ;
        int count = num1 ;
        if( num1 > 0 ){
            while ( num1 != 0 ) {
                num2 = num2 * 10 + num1 % 10;
                num1 /= 10;
            }
            boolean text = (count == num2) ;
            if( text ){
                System.out.println("你输入的是回文数");
            }
            else{
                System.out.println("你输入的不是回文数");
            }
        }
        else{
            System.out.println("你输入的值不正确 ");
        }
    }
}
