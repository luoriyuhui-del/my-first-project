package text02;

public class Goods {
    //定义属性:id 名字 价格 库存
    private String id;
    private String name;
    private double price;
    private int stock;

    //构造方法 : 空参和有参
    public Goods(){};
    public Goods(String id , String name , double price , int stock ){
        this.id = id;
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void show(){
        System.out.println("商品编号：" + id + "商品名称：" + name + "商品价格：" + price + "商品库存：" + stock);
    }
}
