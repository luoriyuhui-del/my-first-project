package a08oopextendsdemo8;

public class AdminStaff extends Employee{
    //无参构造方法
    public AdminStaff() {
        super();
    }
    //有参构造方法
    public AdminStaff(String id, String name) {
        super(id, name);
    }
    @Override
    public void work() {
        System.out.println("员工" + super.getName() + "正在管理职员");
    }
}
