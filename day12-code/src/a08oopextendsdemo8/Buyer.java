package a08oopextendsdemo8;

public class Buyer extends AdminStaff{
    //无参构造方法
    public Buyer() {
        super();
    }
    //有参构造方法
    public Buyer(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("员工" + getName() + "正在采购");
    }
}
