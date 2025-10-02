package text;

import java.util.Scanner;

public class text18 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("请输入您要存入的金额(输入0退出):");
                double money = sc.nextDouble();

                // 添加退出条件
                if (money == 0) {
                    System.out.println("程序已退出");
                    break;
                }

                if (money >= 1000) {
                    System.out.println("请输入您要存的年限(1-4年):");
                    int year = sc.nextInt();
                    if (year >= 1 && year <= 4) {
                        double rate = 0; // 利率
                        switch (year) {
                            case 1 -> rate = 2.25;
                            case 2 -> rate = 2.7;
                            case 3 -> rate = 3.25;
                            case 4 -> rate = 3.6;
                        }
                        double result = money + money * rate * year / 100; // 修正计算公式
                        System.out.println("存入" + money + "元" + "，" + year + "年后，余额为" + result + "元");
                    } else {
                        System.out.println("存入年限不能低于1年且不能大于4年，请重新输入存入年限");
                        continue;
                    }
                } else {
                    System.out.println("存入的金额不能低于1000元，请重新存入");
                }
            }
            sc.close(); // 关闭Scanner资源
        }
}
