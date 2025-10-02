package text;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入此时的路灯状况: 红灯为 1 . 黄灯为 2 . 绿灯为 3");
        while( true ){
            int isLight = sc.nextInt();
            if( isLight == 3 ){
                System.out.println("绿灯请通过");
                break ;
            }
            else if( isLight == 1){
                System.out.println("红灯请等待");
                break;
            }
            else if( isLight == 2){
                System.out.println("黄灯请等待");
                break;
            }
            else{
                System.out.println("请输入正确的路灯状态");
            }
        }
    }
}
