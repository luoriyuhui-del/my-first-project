package Text.Text2;

public class Outer {
    //静态成员内部方法
    static Inter method(){
            return new Inter() {
                public void show() {
                    System.out.println("HelloWorld");
                }
            };
    };
}
