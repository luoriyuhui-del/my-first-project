package text02;

public class GoodsText {
    public static void main(String[] args) {
        //定义第一个商品变量----------//在括号里 ctrl + p 查看参数
        Goods g1 = new Goods("漫步者","W820",328,100);
        //定义第二个变量
        Goods g2 = new Goods("华为手机","HUAWEI P30",6999,100);
        //定义第三个变量
        Goods g3 = new Goods("华硕电脑","X501",5999,100);

        //创建数组存放商品变量
        //创建数组 数据类型是 "Goods"
        Goods[] gs = new Goods[3];
        gs[0] = g1;
        gs[1] = g2;
        gs[2] = g3;
        for (int i = 0; i < gs.length; i++) {
            Goods g = gs[i];
            g.show();
        }
    }
}
