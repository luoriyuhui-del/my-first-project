package text;

import java.util.Random;
import java.util.Scanner;

public class text15 {
    public static void main(String[] args) {
        Random r = new Random();
        int i = r.nextInt(100) + 1;
        //System.out.println( i );
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数字:");
        int count = 0 ;
        while( count != i ){
            int x = sc.nextInt();
            count = x ;
            if( x == i ){
                System.out.println("恭喜你猜对了");
            }
            else if( x > i ){
                System.out.println("你猜的数字太大了  再来一次吧");
            }
            else{
                System.out.println("你猜的数字太小了  再来一次吧");
            }
        }
    }
}
