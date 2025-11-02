package a05polymorphismdemo5;

public class Text {
    public static void main(String[] args) {
        // ----------------------- final 修饰符 -------------------------

       /*final 修改基本引用数据类型 : 记录的值不会发生改变
       final 修改引用数据类型 : 引用变量记录的地址值不会发生改变 , 但是内部的属性值是可以发生改变的*/

        // 注意 --- 被final修饰的变量不能被修改

        final int age = 10;//被final修饰的变量不能被修改 称为常量
        System.out.println(age);
        //age = 20 ;  报错

        //使用final 修饰符 对 引用数据类型 ---- 引用数据类型S存的是地址值 ( 地址值不会发生改变 )
        final Student s = new Student("lin",22,8888);
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getScore());
        //s = new Student();  --- 由于s 被final 修饰 所以不能重新赋值( 地址值 )

        s.setName("zhong");//属性值可以发生改变
        s.setAge(23);//属性值可以发生改变
        System.out.println(s.getName() + " , " + s.getAge() + " , " + s.getScore());
    }
}
