package text;

public class text12 {
    public static void main(String[] args) {
        //--------------------- 对手机号码进行加密 --------------------
        String phone = "13169117286";

        //String substring(int beginIndex, int endIndex)
        //该方法作用是截取字符串 --- beginIndex开始截取 ， endIndex结束截取
        //注意点 : 包头不包尾 , 包左不包右
        //beginIndex : 截取的起始索引
        //endIndex : 截取的结束索引
        //String substring(int beginIndex) ---- 表示截取到末尾
        //只有返回值才是截取的小串 --- 原变量是没有变化的

        String start = phone.substring(0,3);
        //截取手机号的前三位 --- 索引为 0 , 1 , 2

        String end = phone.substring(7);
        //截取手机号的后四位 --- 索引为 7 , 8 , 9 , 10

        String middle =  start + "****" + end;
        System.out.println(middle);
    }
}
