package icom.it.heima.ui;

import java.util.Random;

public class VerificationCodeUtil {
    //验证码工具类

    //创建构造方法 --- 私有化
    private VerificationCodeUtil(){}

    //创建静态方法 --- 获取验证码
    public static String getVerificationCode(){
        String code = "";
        //所需的验证码为4位大小写字母和一位数字 , 位置随机
        char[] c = new char[52];
        Random r = new Random();
        //创建字符数组 --- 存放大小写字母
        for (int i = 0; i < c.length; i++) {
            if( i < 26 ){
                c[i] = (char)('a' + i);
            }else{
                c[i] = (char)('A' + i - 26);
            }
        }
        //随机生成4位大小写字母存入 验证码 字符串
        for (int i = 0; i < 4; i++) {
            int index = r.nextInt(c.length);
            code = code + c[index];
        }
        //随机生成一位数字 加在验证码字符串末尾
        code = code + r.nextInt(10);

        //打乱字符串中的位置
        char[] temp = code.toCharArray();
        int sum = r.nextInt(temp.length);
        char temp1 = temp[temp.length - 1];
        temp[temp.length - 1] = temp[sum];
        temp[sum] = temp1;
        /*for (int i = 0; i < temp.length; i++) {
            int num = r.nextInt(temp.length);
            char temp1 = temp[i];
            temp[i] = temp[num];
            temp[num] = temp1;
        }*/

        code = new String(temp);
        return code;
    }
}
