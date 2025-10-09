package text;

public class phone {
    private String brand;//手机品牌
    private String color;//手机颜色
    private double price;//手机价格

    public phone(){};
    public phone(String brand,String color,double price){
        this.brand = brand;
        this.color = color;
        this.price = price;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }
    public String getBrand(){
        return brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    public void call(){
        System.out.println("打电话");
    }
    public void sendMessage(){
        System.out.println("发短信");
    }
}
