package com.itheima.a06innerclassdemo6;

public class Car {
    // ---------------------------------- 新建汽车外部类 ----------------------------------
    // 外部类要访问内部类中的成员变量和方法 --- 必须通过外部类对象创建内部类对象
    private String carName;
    private int carAge;
    private String color;

    public void show(){
        Engine engine = new Engine();//------ 在下面的打印语句访问内部类成员变量( engineName)时,必须创建内部类对象( engine )
        System.out.println(carName + ":" + color + ":" + carAge + ":" + engine.engineName);
    }

    //在外部类中定义一个方法,返回内部类对象
    public Engine getEngine() {
        return new Engine();
    }

    class Engine{
        // ---------------------------------- 新建汽车内部类 ----------------------------------
        //内部类可以访问外部类的所有成员变量和方法 (包括私有 )
        private String engineName;
        private int engineAge;

        public void show(){
            System.out.println(carName + ":" + engineName);
        }

        public Engine() {
        }

        public Engine(String engineName, int engineAge) {
            this.engineName = engineName;
            this.engineAge = engineAge;
        }

        public String getEngineName() {
            return engineName;
        }

        public void setEngineName(String engineName) {
            this.engineName = engineName;
        }

        public int getEngineAge() {
            return engineAge;
        }

        public void setEngineAge(int engineAge) {
            this.engineAge = engineAge;
        }
    }

    public Car(String carName, int carAge, String color) {
        this.carName = carName;
        this.carAge = carAge;
        this.color = color;
    }

    public Car() {
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public int getCarAge() {
        return carAge;
    }

    public void setCarAge(int carAge) {
        this.carAge = carAge;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
