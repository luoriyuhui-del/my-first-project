package text;

public class text13 {
    public static void main(String[] args) {
        String idCardNumber = "440883200010011111";

        //取出生日年月日
        String age = idCardNumber.substring(6,10);
        String month = idCardNumber.substring(10,12);
        String day = idCardNumber.substring(12,14);

        //取出性别
        //String sex = idCharNumber.charAt(16);
        //int sexNum = sex - 48 ; 字符相减后得到数字 --- 将字符转化为数字 ---
        String sex = idCardNumber.substring(16,17);
        //Integer.parseInt(sex)方法的作用是将一个字符串类型的 sex 转换为对应的 int 类型整数
        int sexNum = Integer.parseInt(sex);

        System.out.println("出生日期为" + age + "年" + month + "月" + day + "日" );
        System.out.println( "性别为" + (sexNum % 2 == 0 ? "女" : "男"));
    }
}
