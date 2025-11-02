package a08oopextendsdemo8;

public class Tutor extends Teacher{
    //无参构造方法
    public Tutor() {
        super();
    }
    //有参构造方法
    public Tutor(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("助教" + super.getName() + "正在为同学分析知识点");
    }
}
