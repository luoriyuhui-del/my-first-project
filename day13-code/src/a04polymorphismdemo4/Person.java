package a04polymorphismdemo4;

public class Person {
    private String name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void keepPet(Animal a , String something){
        //a.lookHome(); --- 对于多态类型的对象不能调用子类的独有方法
        if( a instanceof Dog d){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的小狗");
            a.eat( something);
            d.lookHome();
        }else if( a instanceof Cat c){
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的小猫");
            a.eat( something);
            c.catchMouse();
        } else if (a instanceof Rabbit b) {
            System.out.println("年龄为" + age + "岁的" + name + "养了一只" + a.getColor() + "的" + a.getAge() + "岁的小兔兔");
            a.eat( something);
            b.hide();
        }else{
            System.out.println("没有这个类型");
        }

    }

}
