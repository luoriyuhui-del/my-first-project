package a01staticdemo1;

public class StudentText {
    public static void main(String[] args) {
        //调用静态属性( static )值时 , 使用类名.属性名 --- 静态属性值是所有对象共享的( 存储在静态区 )
        Student.teacherName = "落日余晖老师";

        Student s1 = new Student();
        s1.setName("小林");
        s1.setAge(22);
        s1.setGender('男');
        s1.get1();
        s1.show();

        // ---- 第二次赋值将其teacherName进行改变 --- Student.teacherName = "黑马程序员";
        Student s2 = new Student();
        s2.setName("小钟");
        s2.setAge(23);
        s2.setGender('女');
        s2.get1();
        s2.show();
    }
}
