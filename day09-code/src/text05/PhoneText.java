package text05;

import java.util.Scanner;

public class PhoneText {
    public static void main(String[] args) {
        Phone []arr = new Phone[3];
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            Phone p = getPhone();
            arr[i] = p;
            p.show();
            sum += p.getPrice();
        }
        System.out.println("总价为:" + sum);
        System.out.println("平均价格为:" + sum/arr.length);
    }
    public static Phone getPhone(){
        Scanner sc = new Scanner(System.in);
        Phone p = new Phone();
        System.out.println("请输入手机品牌:");
        String Brand = sc.next();
        p.setBrand(Brand);
        System.out.println("请输入手机价格:");
        double Price = sc.nextDouble();
        p.setPrice(Price);
        System.out.println("请输入手机颜色:");
        String Color = sc.next();
        p.setColor(Color);
        return p;
    }
}
