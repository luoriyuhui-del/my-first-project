package a04polymorphismdemo4;

public class Rabbit extends  Animal{
    String name = "小兔兔";
    public Rabbit() {
    }
    public Rabbit( int age, String color) {
        super( age, color);
    }
    @Override
    public void eat(String something){
        System.out.println(getAge() + "岁 " + getColor() + " 的调皮 "+ name +  "夸夸吃" +  something);
    }
    public void hide(){
        System.out.println("兔子躲起来");
    }
}
