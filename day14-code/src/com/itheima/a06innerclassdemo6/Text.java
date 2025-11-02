package com.itheima.a06innerclassdemo6;

public class Text {
    public static void main(String[] args) {
        Car c = new Car();
        c.setCarName("保时捷");
        c.setCarAge(1);
        c.setColor("敦煌色");

        Car.Engine e = new Car().new Engine();
        e.setEngineName("12缸超然发动机");
        e.setEngineAge(2019);

        c.show();

        //获取内部类对象
        System.out.println(c.getEngine());

    }
}
