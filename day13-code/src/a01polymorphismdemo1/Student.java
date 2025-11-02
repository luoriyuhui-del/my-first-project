package a01polymorphismdemo1;

public class Student extends  Person{
    //继承于 Person
    public Student() {}

    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void show(){
        System.out.println("学生信息为:" + getName() + " , " + getAge() );
    }
}
