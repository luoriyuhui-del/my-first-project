package a08oopextendsdemo8;

public class Text {
    public static void main(String[] args) {
        // ------------ 特别注意 : 所有的类都有一个终极父类: Object ---------------
        Lecturer l = new Lecturer();
        l.setId("1001");
        l.setName("lin");
        System.out.println("员工编号为" + l.getId() + "的员工姓名为" + l.getName() );
        l.work();
        System.out.println(" ---------------------------------------- ");

        Tutor t = new Tutor("1002","zhong");
        System.out.println("员工编号为" + t.getId() + "的员工姓名为" + t.getName() );
        t.work();
        System.out.println(" ---------------------------------------- ");

        Maintainer ma = new Maintainer();
        ma.setId("1003");
        ma.setName("zhangsan");
        System.out.println("员工编号为" + ma.getId() + "的员工姓名为" + ma.getName() );
        ma.work();
        System.out.println(" ---------------------------------------- ");

        Buyer b = new Buyer();
        b.setId("1004");
        b.setName("lisi");
        System.out.println("员工编号为" + b.getId() + "的员工姓名为" + b.getName() );
        b.work();
        System.out.println(" ---------------------------------------- ");
    }
}
