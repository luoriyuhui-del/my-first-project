package com.itheima.text;

public class text09 {
    public static void main(String[] args) {
//--------------------------------爱心------------------
                double x, y;
                for (y = 1.5; y > -1.5; y -= 0.1) {
                    for (x = -1.5; x < 1.5; x += 0.05) {
                        double a = x * x + y * y - 1;
                        if (a * a * a - x * x * y * y * y <= 0.0) {
                            System.out.print("*");
                        } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }


    }
}
