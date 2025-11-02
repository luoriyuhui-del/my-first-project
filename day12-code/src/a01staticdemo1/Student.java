package a01staticdemo1;

public class Student {
    private String name;
    private int age;
    private char gender;
    // 静态属性 static --- 整个类共享的属性
    public static String teacherName = "黑马程序员";

    public Student(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void get1(){
        System.out.println(name + "正在学习");
    }
    public void show( ){
        System.out.println(name + " " + age + " " + gender + " 带教老师为" +  teacherName);
    }

}
