package a08oopextendsdemo8;

public class Lecturer extends Teacher{
    //无参构造方法
    public Lecturer() {
        super();
    }
    //有参构造方法
    //父类 + 父类 + 子类
    public Lecturer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("讲师" + super.getName() + "正在讲课");
    }
}
