package text;

import java.util.Scanner;

public class text01 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("请输入小明的名次:");
        int ranking = sc.nextInt();
        if( ranking == 1){
            System.out.println("恭喜小红成为小明的女朋友");
        }
        else{
            System.out.println("小红没能成为小明的女朋友");
        }
    }
}
