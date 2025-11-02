package a07oopextendsdemo7;

public class Manager extends Employee{
    //个人属性 : 管理奖金
    private double bonus;
    public Manager() {
        //在无参构造中可以不写super();虚拟机会自动添加super(); ---- 但是在有参构造中不可以 , 需要手动添加
        super();
    }

    //父类 加 子类
    public Manager(String id , String name , double salary , double bonus){
        //调用父类有参构造方法
        super(id , name , salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    //方法重写
    @Override
    public void work() {
        //通过super关键字访问父类中的属性
        System.out.println("经理" + super.getName() + "管理其他人");
    }

}
