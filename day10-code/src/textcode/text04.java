package textcode;

import java.util.Random;

public class text04 {
    public static void main(String[] args) {
        // --------------------------- 菜鸟解法 ---------------------------
        //将大小写字母放到一个数组中 , 随机抽取一个字母填满前四位 , 再随机生成一个数字填满第5位 --- 然后打乱数组


        // --------------------------- 优解 ---------------------------
        //随机生成一个密码 长度为5位 , 由4个大小写字母和一个数字组成 , 它们的位置不限
        Random r = new Random();
        char[] ch = new char[5];
        
        // 先随机确定数字的位置 --- 随机决定数字在第几个位置 --- ( 太聪明了 )
        int numberIndex = r.nextInt(5);
        
        // 填充每个位置
        for (int i = 0; i < ch.length; i++) {
            if (i == numberIndex) {
                // 在指定位置放置数字
                ch[i] = (char) (r.nextInt(10) + '0');
            } else {
                // 其他位置放置字母，随机选择大写或小写
                if (r.nextBoolean()) {
                    ch[i] = (char) (r.nextInt(26) + 'a');  // 小写字母
                } else {
                    ch[i] = (char) (r.nextInt(26) + 'A');  // 大写字母
                }
            }
        }

        //创建一个StringBuilder对象 --- 对于字符串的拼接更快更省内存
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ch.length; i++) {
            sb.append(ch[i]);
        }
        String str = sb.toString();
        System.out.println(str);
    }
}
