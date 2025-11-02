package a02polymorphismdemo2;

public class Dog extends   Animal{
    String name = "旺财";
    @Override
    public void eat(){
        System.out.println("吃狗粮");
    }
}
