package text06;

import java.util.Scanner;

public class GirlFriendText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //定义数组存取GirlFriend对象
        GirlFriend[] gf = new GirlFriend[4];

        //创建循环输入 数据
        for (int i = 0; i < gf.length; i++) {
            //创建对象
            GirlFriend gf1 = new GirlFriend();
            //录入数据创建名字 年龄 性别 爱好
            System.out.println("请输入第" + (i + 1) + "个女朋友的名字：");
            String name = sc.next();
            gf1.setName(name);

            System.out.println("请输入第" + (i + 1) + "个女朋友的年龄：");
            int age = sc.nextInt();
            gf1.setAge(age);

            System.out.println("请输入第" + (i + 1) + "个女朋友的性别：");
            char gender = sc.next().charAt(0);
            gf1.setGender(gender);

            System.out.println("请输入第" + (i + 1) + "个女朋友的爱好：");
            String hobby = sc.next();
            gf1.setHobby(hobby);

            //将所有数据放入数组中
            gf[i] = gf1;
            System.out.println("-----------------------------");
            gf1.show();
        }

        int sum = 0;//定义变量存取
        for (int i = 0; i < gf.length; i++) {
            sum += gf[i].getAge();
        }
        int count = sum / gf.length ;
        System.out.println("所有女朋友的平均年龄是：" + count);

        for (int i = 0; i < gf.length; i++) {
            if( gf[i].getAge() < count){
                System.out.println(gf[i].getName() + "小于平均年龄");
                gf[i].show();
            }
        }
    }
}
