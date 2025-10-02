package com.itheima.code;

public class text02 {
    // ... existing code ...
public static void main(String[] args) {
    //生成101--200之间的数
    int count = 0;
    for (int i = 101; i <= 200; i++) {
        boolean isPrime = true;
        for (int j = 2; j <= Math.sqrt(i); j++) {
            if (i % j == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(i + "是素数");
            count++;
        }
    }
    System.out.println("素数的个数为" + count);
}
// ... existing code ...


}
