package a02polymorphismdemo2;

public class Cat extends   Animal{
    String name = "小猫";
    @Override
    public void eat(){
        System.out.println("吃猫粮");
    }
}
