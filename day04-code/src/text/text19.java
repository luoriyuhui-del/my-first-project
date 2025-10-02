package text;

import java.util.Scanner;

public class text19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while( true ){
            System.out.println("是否需要服务(输入0退出)");
            int exit = sc.nextInt();
            if( exit == 0 ){
                break;
            }
            System.out.println("请输入你要存入的金额：");
            double money = sc.nextDouble();

            if( money >= 1000){
                System.out.println("请输入你要存的年限( 1 ~ 4 )：");
                int year = sc.nextInt();
                if(year >= 1 && year <= 4){
                    double count = 0 ;
                    switch( year){
                        case 1 -> { count = 0.025; }
                        case 2 -> { count = 0.0275; }
                        case 3 -> { count = 0.0325; }
                        case 4 -> { count = 0.035; }
                    }
                    System.out.println( "您存入" + money + "元，" + year + "年后，余额为" + (money + money * count * year));
                }
                else{
                    System.out.println("请输入正确的年限");
                    continue;
                }
            }
            else{
                System.out.println("存入金额不能低于1000 , 请输入正确的金额");
            }
        }
    }
}
