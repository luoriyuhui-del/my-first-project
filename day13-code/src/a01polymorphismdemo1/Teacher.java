package a01polymorphismdemo1;

public class Teacher extends  Person{
    public Teacher() {
    }
    public Teacher(String name, int age) {
        super(name, age);
    }
    @Override
    public void show(){
        System.out.println("教师信息为:" + super.getName() + " " + getAge() );
    }
}
