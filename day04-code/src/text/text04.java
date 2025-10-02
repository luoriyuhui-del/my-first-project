package text;

import java.util.Scanner;

public class text04 {
    public static void main(String[] args) {
        int money = 1000;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你的会员等级:");
        int count = sc.nextInt();
        switch (count) {
            case 1:
                money = money * 90 / 100;
                System.out.println("会员等级为1,打9折,优惠金额:" + money);
                break;
            case 2:
                money = money * 80 / 100;
                System.out.println("会员等级为2,打8折,优惠金额:" + money );
                break;
            case 3:
                money = money * 70 / 100;
                System.out.println("会员等级为3,打7折,优惠金额:" + money );
                break;
            default:
                System.out.println("没有优惠");
        }
    }
}
