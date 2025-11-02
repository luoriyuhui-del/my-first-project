package a04polymorphismdemo4;

public class Dog extends   Animal{
    String name = "狗";
    public Dog(){
        super();
    }

    public Dog(int age, String color){
        super(age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁 " + getColor() + " 的 "+ name +  "吃" +  something);
    }
    public void lookHome(){
        System.out.println("狗看家");
    }
}
