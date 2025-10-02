package text;

import java.util.Scanner;

public class text16 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的第一个起始范围:");
        int start = sc.nextInt();
        System.out.println("请输入你的终止范围:");
        int end = sc.nextInt();
        int count = 0 ;
        for(int i = start ; i <= end ; i++){
            if( i % 3 == 0 && i % 5 == 0 ){
                System.out.println(i + "是3和5的整数倍");
                count++;
            }
        }
        System.out.println("共有" + count + "个");
    }
}
