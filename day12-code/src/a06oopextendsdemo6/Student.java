package a06oopextendsdemo6;

public class Student {
    String name;
    int age;
    String school;

    public Student() {
        //表示调用本类其他构造方法 -- 在无参中调用有参构造方法
        //注意细节:虚拟机就不会再添加super();
        this(null,0,"中山大学");
    }
    public Student(String name, int age , String school) {
        this.name = name;
        this.age = age;
        this.school = school;
        System.out.println("name - " + name + " age - " + age + " school - " + school);
    }
}
