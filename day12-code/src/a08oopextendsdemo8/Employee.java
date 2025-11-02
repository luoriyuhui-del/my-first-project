package a08oopextendsdemo8;

public class Employee {
    //每一位属性 : 工号 姓名 负责的工作
    private String id;
    private String name;

    public Employee() {
    }

    public Employee(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void work() {
        System.out.println("员工" + name + "正在工作");
    }
}
