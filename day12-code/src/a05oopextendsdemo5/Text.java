package a05oopextendsdemo5;

public class Text {
    public static void main(String[] args) {
        // ------------ 特别注意 : 所有的类都有一个终极父类: Object ---------------

        //子类不能继承父类中的构造方法 , 但是可以通过super();调用父类中的构造方法
        //介绍继承中构造方法的访问规则
        //可以通过子类对象访问父类中的属性和方法 -- super();
        //super();要写在子类构造方法中的第一行 ---空参
        //super(name, age);需要手动写在构造方法中的第一行 -- 有参
        Student s = new Student("lin" , 22);
        System.out.println(s.name + " " + s.age);
    }
}
