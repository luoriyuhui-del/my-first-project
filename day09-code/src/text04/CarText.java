package text04;

import java.util.Scanner;

public class CarText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建数组
        Car[] arr = new Car[3];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getCar();
            Car num = arr[i];
            num.show();
        }
    }

    public static Car getCar(){
        //创建对象输入方法
        //创建数组
        Scanner sc = new Scanner(System.in);
        //创建一个对象
        Car c = new Car();
        System.out.println("请输入汽车品牌:");
        String Brand = sc.next();
        c.setBrand( Brand );
        System.out.println("请输入汽车价格:");
        double Price = sc.nextDouble();
        c.setPrice( Price );
        System.out.println("请输入汽车颜色:");
        String Color = sc.next();
        c.setColor( Color );
        return c;
    }
}
