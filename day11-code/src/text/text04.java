package text;

import java.util.ArrayList;
import java.util.Scanner;

public class text04 {
    public static void main(String[] args) {
        //定义一个集合 , 添加一些学生对象 , 并进行遍历 --- 学生类属性为 : 姓名 年龄
        Scanner sc = new Scanner(System.in);
        ArrayList< Student > list = new ArrayList<>();
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        for (int i = 0; i < list.size(); i++) {
            System.out.println("请输入第" + (i + 1) + "个学生的姓名");
            Student s = list.get(i);
            String name = sc.next();
            s.setName(name);
            System.out.println("请输入第" + (i + 1) + "个学生的年龄");
            int age = sc.nextInt();
            s.setAge(age);
        }
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getName() + " , " + s.getAge());
        }
        System.out.println(list.size());
    }
}
