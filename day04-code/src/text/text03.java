package text;

import java.util.Scanner;

public class text03 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入你的座位号:");
        while ( true ) {
            int count = sc.nextInt();
            if( count > 1 && count < 100 && count % 2 == 0){
                System.out.println("您的座位号在右侧");
                break;
            }
            else if( count > 1 && count < 100 && count % 2 != 0){
                System.out.println("您的座位号在左侧");
                break;
            }
            else{
                System.out.println("请输入正确的座位号");
            }
        }
    }
}
