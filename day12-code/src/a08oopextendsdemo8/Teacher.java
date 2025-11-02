package a08oopextendsdemo8;

public class Teacher extends Employee{
    //无参构造方法
    public Teacher() {
        super();
    }
    //有参构造方法 --- 父类加子类
    public Teacher(String id, String name) {
        super(id, name);
    }

    //方法重写
    @Override
    public void work() {
        System.out.println("老师" + super.getName() + "正在教学");
    }
}
