package com.itheima.a04objectdemo;

public class ObjectDemo2 {
    public static void main(String[] args) {
        /*
         public boolean equals(Object obj)          比较两个对象是否相等
         */

        Student s1 = new Student("张三",18);
        Student s2 = new Student("张三",18);
        System.out.println(s1.equals(s2));

        //在没有重写equals()方法时，默认情况下，Object中的equals方法比较两个对象地址值是否相同
        //       ----    等价于 " == "
        //  ----- 两个对象地址值相同，返回true
        //但是地址值对于我们来说是没有意义的 -- 所以我们需要重写equals()方法 -- 比较对象的属性值
    }
}
