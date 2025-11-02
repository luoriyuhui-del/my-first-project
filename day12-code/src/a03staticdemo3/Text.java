package a03staticdemo3;

import java.util.ArrayList;

public class Text {
    public static void main(String[] args) {
        // ----------------------------- 测试类 -----------------------------

        // 创建集合
        ArrayList<Student> list = new ArrayList<>();

        //创建3个学生对象
        Student s1 = new Student("小王", 18, '男');
        Student s2 = new Student("小张", 19, '女');
        Student s3 = new Student("小李", 20, '男');

        list.add(s1);
        list.add(s2);
        list.add(s3);

        int maxAge = StudentUtil.studentMaxAge( list);
        System.out.println("在学生集体中最大的年龄为" + maxAge);
    }
}
