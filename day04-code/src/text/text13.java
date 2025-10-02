package text;

import java.util.Scanner;

public class text13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于等于2的整数:");
        int number = sc.nextInt();
        int i = 0 , count = 0 ;
        for( i = 1  ; count <= number ; i++ ){
            count = i * i ;
            if( count == number) {
                System.out.println(number + "的平方根为:" + i );
                break;
            }
            else if( count > number){
                    System.out.println( number + "的平方根为:" + ( i - 1 ) );
                    break;
                }
        }

    }
}
