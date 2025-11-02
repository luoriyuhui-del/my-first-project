package a01polymorphismdemo1;

public class Text {
    public static void main(String[] args) {
        // ------------ 特别注意 : 所有的类都有一个终极父类: Object ---------------

        //本次学习多态性 , 表示一个子类的形态可以转化为父类的形态
        //比如 Student是学生 , Teacher是老师 , Administrator是管理员 --- 他们都可以转化为 Person 人形态
        //在一个登录系统方法中 , 以上三人都要注册 ,但是他们的类型不一致 , 就可以使用多态性 --- 形参类型为 Person

        //多态 : 对象的多种形态
        //多态的前提 : 1 . 有继承 / 实现关系  2. 父类引用指向子类对象  3. 子类重写父类的方法
        //多态的好处 : 1 . 使用父类型作为参数 , 可以接收所用子类对象  2 . 体现多态的扩展性与便利
        Student s = new Student();
        s.setName("lin");
        s.setAge(22);
        register( s);

        Teacher t = new Teacher();
        t.setName("lin");
        t.setAge(22);
        register( t);
        
        Administrator a = new Administrator();
        a.setName("wang");
        a.setAge(22);
        register( a);

    }

    public static void register(Person p){
        //在多态中 ,  根据提供的对象类型 --- 使用不同的show 方法
        p.show();
    }
}
