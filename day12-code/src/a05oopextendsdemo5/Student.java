package a05oopextendsdemo5;

public class Student extends  Person{
    public Student() {
        //super(); 表示创建父类无参构造方法
        super();
        System.out.println("子类无参构造方法");
    }

    public Student(String name, int age) {
        //表示创建父类有参构造方法
        super(name, age);
        System.out.println("子类有参构造方法");
    }
}
