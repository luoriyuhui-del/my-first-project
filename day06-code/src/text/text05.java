package text;

import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个小数:");
        double num = sc.nextDouble();

        double result = math( num);
        System.out.println(result);
    }

    public static double math(double sum ){
        if( sum > 0){
            return sum;
        }
        else{
            return -sum;
        }
    }
}
