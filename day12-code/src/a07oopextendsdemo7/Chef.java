package a07oopextendsdemo7;

public class Chef extends Employee{
    public Chef(){
        //在无参构造中可以不写super();虚拟机会自动添加super(); ---- 但是在有参构造中不可以 , 需要手动添加
        super();
    }
    public Chef(String id , String name , double salary){
        //调用父类有参构造方法
        super(id, name, salary);
    }

    //方法重写
    @Override
    public void work() {
        System.out.println("厨师" + super.getName() + "正在炒菜");
    }
}
