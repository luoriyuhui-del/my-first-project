package text;

import java.util.ArrayList;
import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        //定义集合 , 存入三个手机品牌 --- 手机类属性为 : 手机品牌 手机价格
        ArrayList<Phone> list = new ArrayList<>();
        Phone p1 = new Phone("华为", 5999);
        Phone p2 = new Phone("苹果", 9999);
        Phone p3 = new Phone("小米", 3999);

        list.add(p1);
        list.add(p2);
        list.add(p3);

        //创建一个集合 , 存储低于5000的手机
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入预算");
        double budget = sc.nextDouble();
        ArrayList<Phone> list1 = getPhone(list , budget);

        //遍历集合 --- 打印低于预算的手机信息
        for (int i = 0; i < list1.size(); i++) {
            Phone p = list1.get(i);
            System.out.println(p.getBrand() + " : " + p.getPrice());
        }
    }
    // 定义方法 1 . 比较价格 , 价格低于所提供的预算的返回
    // 2 . 需要提供两个参数 1.集合 2 . 预算
    // 3 . 返回值 --- 低于预算的手机信息
    public static ArrayList<Phone> getPhone(ArrayList<Phone> list , double budget){
        ArrayList<Phone> list1 = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            Phone p = list.get(i);
            double price = p.getPrice();
            if( price <= budget ){
                list1.add(p);
            }
        }
        return list1;
    }
}
