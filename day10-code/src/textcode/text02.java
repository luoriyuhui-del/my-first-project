package textcode;

import java.util.Scanner;

public class text02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个字符串:");
        String str1 = sc.next();
        System.out.println("请输入第二个对比字符串:");
        String str2 = sc.next();
        
        // 边界条件检查
        if (str1 == null || str2 == null || str1.length() != str2.length()) {
            System.out.println("字符串不相等 -- false ");
            return;
        }
        
        // 特殊情况：两个空字符串
        if (str1.length() == 0) {
            System.out.println("字符串相等 -- true ");
            return;
        }
        
        boolean found = false;
        // 创建一个临时字符串，用于存储旋转后的字符串 --- 原初始值不可改变
        String temp = str1;
        
        // 最多尝试 str1.length() 次旋转
        for (int i = 0; i < str1.length(); i++) {
            if (temp.equalsIgnoreCase(str2)) {
                System.out.println("字符串相等 -- true ");
                found = true;
                break;
            }
            temp = get(temp);
        }
        
        if (!found) {
            System.out.println("字符串不相等 -- false ");
        }
    }

    //创建方法将字符串的左边第一位移动到右边
    public static String get(String str){

        //第二种思路 , 将字符串变成数组 --- 再对数组中的前一位索引和后一位索引互换 , 直到第一位变成最后一位
        //char[] ch = str.toCharArray();
        //  char temp = '';
        //for(int i = 0; i < ch.length - 1; i++){
        //      temp = ch[i];
        //      ch[i] = ch[i + 1];
        //      ch[i + 1] = temp;
        // }


        //创建一个StringBuilder对象 --- 第一种解法
        StringBuilder sb = new StringBuilder();

        //添加字符串
        sb.append(str);

        //获取字符串的第一位
        char c = sb.charAt(0);

        //删除字符串的第一位
        sb.deleteCharAt(0);

        //将删除后的字符串添加到末尾
        sb.append(c);

        return sb.toString();
    }
}
