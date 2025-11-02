package a07oopextendsdemo7;

public class Employee {
    //共同属性 : 工号 姓名 工资
    //共同方法 : 工作 吃饭
    private String id;
    private String name;
    private double salary;
    public void work() {
        System.out.println("员工" + name + "正在工作");
    }
    public void eat() {
        System.out.println("员工" + name + "正在吃米饭");
    }

    //无参构造 方法
    public Employee() {
    }
    //有参构造 方法
    public Employee(String id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
