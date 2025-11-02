package a04polymorphismdemo4;

public class Text {
    public static void main(String[] args) {
        // ------------- 对于封装 继承 多态的练习 ---------------
        // -------- 有对多态优点的应用于对多态弊端的优化 ---------

        //定义一个person对象
        Person p = new Person("张三", 18);
        Person p2 = new Person("小林", 22);

        Animal a = new Dog(5, "白色");//自动转换类型
        Animal a2 = new Cat(3, "黑色");//自动转换类型
        Animal a3 = new Rabbit(23, "五颜六色");//自动转换类型

        p.keepPet(a, "骨头");
        p.keepPet(a2, "小鱼干");
        p2.keepPet(a3, "大葱");

    }
}
