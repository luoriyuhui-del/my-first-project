package text04;

public class lover {
    //姓名，身高，体重。行为包含：洗衣服wash()，做饭cook()。
    private String name;
    private double height;
    private double weight;
    public lover(){};
    public lover(String name,double height,double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getName(){
        return name;
    }
    public void wash(){
        System.out.println("洗衣服");
    }
    public void cook(){
        System.out.println("做饭");
    }
    public void show(){
        System.out.println("姓名：" + name + "，身高：" + height + "，体重：" + weight);
    }
}
