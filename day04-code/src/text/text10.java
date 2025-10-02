package text;

import java.util.Scanner;

public class text10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个除数:");
        int chu = sc.nextInt();
        System.out.println("请输入一个被除数:");
        int x = sc.nextInt();
        int i = 0 , j = 0 ;
        while( chu >= x ){
            chu = chu - x ;
            i++;
        }
        System.out.println("商为:" + i );
        System.out.println( "商为:" + chu );
            }
}
