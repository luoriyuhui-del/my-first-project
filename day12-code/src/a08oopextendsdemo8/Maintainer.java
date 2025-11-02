package a08oopextendsdemo8;

public class Maintainer extends AdminStaff{
    //无参构造方法
    public Maintainer() {
        super();
    }
    //有参构造方法
    public Maintainer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("管理员" + super.getName() + "正在维护系统");
    }
}
