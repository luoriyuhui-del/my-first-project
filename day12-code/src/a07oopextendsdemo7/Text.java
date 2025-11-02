package a07oopextendsdemo7;

public class Text {
    public static void main(String[] args) {
        //新建经理与厨师两个对象类 --- 并抽取共有的属性 成为父类 , 然后新建各自的javaBean类
        // ---------------- 考验对象的继承理解 -- (有参无参构造方法的写法)
        // ---------------- 有参构造方法 ----------------
        Manager m = new Manager("01", "lin", 5000, 500);
        System.out.println(m.getId());
        System.out.println(m.getName());
        System.out.println(m.getSalary());
        System.out.println(m.getBonus());
        m.work();
        m.eat();
        System.out.println("===================");

        Chef c = new Chef("02", "lin", 5000);
        System.out.println(c.getId());
        System.out.println(c.getName());
        System.out.println(c.getSalary());
        c.work();
        c.eat();
        System.out.println("===================");

        Manager m2 = new Manager();
        m2.setId("03");
        m2.setName("lin");
        m2.setSalary(5000);
        m2.setBonus(500);
        System.out.println(m2.getId());
        System.out.println(m2.getName());
        System.out.println(m2.getSalary());
        System.out.println(m2.getBonus());
        m2.work();
        m2.eat();
        System.out.println("===================");

        Chef c2 = new Chef();
        c2.setId("04");
        c2.setName("lin");
        c2.setSalary(5000);
        System.out.println(c2.getId());
        System.out.println(c2.getName());
        System.out.println(c2.getSalary());
        c2.work();
        c2.eat();
        System.out.println("===================");

    }
}
