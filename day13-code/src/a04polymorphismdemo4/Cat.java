package a04polymorphismdemo4;

public class Cat extends Animal{
    String name = "小猫";
    public Cat() {
    }

    public Cat( int age, String color) {
        super( age, color);
    }
    @Override
    public void eat(String something) {
        System.out.println(getAge() + "岁 " + getColor() + " 的 "+ name +  "吃" +  something);
    }
    public void catchMouse() {
        System.out.println("猫抓老鼠");
    }
}
