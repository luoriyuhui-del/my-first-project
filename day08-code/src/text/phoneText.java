package text;

public class phoneText {
    public static void main(String[] args) {
        phone p = new phone();
        p.setBrand("小米");
        p.setColor("黑色");
        p.setPrice(3998.8);
        //正在使用价格为3998元黑色的小米手机打电话....
        //正在使用价格为3998元黑色的小米手机发短信....
        System.out.print("正在使用价格为" + p.getPrice() + "元" + p.getColor() + "的" + p.getBrand() + "手机" );
        //p.call();
        p.sendMessage();
    }
}
