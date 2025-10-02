package com.itheima.code;

import java.util.Scanner;

public class text01 {
    // ... existing code ...
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double price = getValidatedPrice(sc);
    int month = getValidatedMonth(sc);
    int type = getValidatedType(sc);

    // 季节分两种情况 , 1.旺季5--10 2.淡季 11-4
    // 等级不同分2种

    if (month >= 5 && month <= 10) {
        price = calculatePeakSeasonPrice(price, type);
    } else if ((month >= 11 && month <= 12) || (month <= 4 && month >= 1)) {
        price = calculateOffSeasonPrice(price, type);
    } else {
        System.out.println("输入的机票月份有误");
    }

    System.out.println("机票价格:" + price);
}

/**
 * 旺季头等舱折扣：90%
 * 旺季经济舱折扣：85%
 * 淡季头等舱折扣：70%
 * 淡季经济舱折扣：65%
 */
private static final double PEAK_SEASON_FIRST_CLASS_DISCOUNT = 0.9;
private static final double PEAK_SEASON_ECONOMY_CLASS_DISCOUNT = 0.85;
private static final double OFF_SEASON_FIRST_CLASS_DISCOUNT = 0.7;
private static final double OFF_SEASON_ECONOMY_CLASS_DISCOUNT = 0.65;

private static double calculatePeakSeasonPrice(double price, int type) {
    if (type == 1) {
        return price * PEAK_SEASON_FIRST_CLASS_DISCOUNT;
    } else if (type == 2) {
        return price * PEAK_SEASON_ECONOMY_CLASS_DISCOUNT;
    } else {
        System.out.println("输入的机票等级有误");
        return price;
    }
}

private static double calculateOffSeasonPrice(double price, int type) {
    if (type == 1) {
        return price * OFF_SEASON_FIRST_CLASS_DISCOUNT;
    } else if (type == 2) {
        return price * OFF_SEASON_ECONOMY_CLASS_DISCOUNT;
    } else {
        System.out.println("输入的机票等级有误");
        return price;
    }
}

private static double getValidatedPrice(Scanner sc) {
    while (true) {
        try {
            System.out.println("请输入机票价格:");
            return Double.parseDouble(sc.next());
        } catch (NumberFormatException e) {
            System.out.println("请输入有效的机票价格");
        }
    }
}

private static int getValidatedMonth(Scanner sc) {
    while (true) {
        try {
            System.out.println("请输入机票的月份:");
            int month = Integer.parseInt(sc.next());
            if (month >= 1 && month <= 12) {
                return month;
            } else {
                System.out.println("请输入有效的月份（1-12）");
            }
        } catch (NumberFormatException e) {
            System.out.println("请输入有效的月份");
        }
    }
}

private static int getValidatedType(Scanner sc) {
    while (true) {
        try {
            System.out.println("请输入机票的等级: 头等1 经济2");
            int type = Integer.parseInt(sc.next());
            if (type == 1 || type == 2) {
                return type;
            } else {
                System.out.println("请输入有效的机票等级（1或2）");
            }
        } catch (NumberFormatException e) {
            System.out.println("请输入有效的机票等级");
        }
    }
}
// ... existing code ...

}
