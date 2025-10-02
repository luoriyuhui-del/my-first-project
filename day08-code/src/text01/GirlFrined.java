package text01;

public class GirlFrined {
    private String name;
    private int age;
    private double height;

    public void setName(String n){
        name = n ;
    }

    public String getName() {
        return name;
    }

    public void setHeight(double height) {
        if(height >= 1.5 && height <= 2.0){
            this.height = height;
        }else{
            System.out.println( "身高不符合要求" );
        }
    }
    public double getHeight() {
        return height;
    }

    public void setAge(int age) {
        if(age >= 18 && age <= 25){
            this.age = age;
        }else{
            System.out.println( "年龄不符合要求" );
        }
    }

    public int getAge() {
        return age;
    }
    public void number(){
        System.out.println( "撒娇 口交" );
    }
    public void playGame(){
        System.out.println( "看电影 大飞机" );
    }
    public void call(){
        System.out.println( "cosplay游戏" );
    }
}
