package text;

import java.util.StringJoiner;

public class text19 {
    public static void main(String[] args) {
        // ---------------- 使用StringJoiner 的场景 --------------------
        // StringJoiner类 ：字符串连接器 --- 类似于StringBuilder类
        // StringJoiner类提供了很多方法，可以进行字符串的拼接，反转，截取，替换，删除等等操作 ---
        // 主要的 : 它区别于StringBuilder类，StringJoiner类可以在字符串中添加分隔符 开始符 结束符

        // 创建StringJoiner对象 --- 并在创建对象中指定分隔符 ( 中间添加 "," , 起始位添加 "[" , 结束为添加 "]")
        StringJoiner sj = new StringJoiner(", ", "[", "]");

        // 添加数据
        sj.add("aaa").add("bbb").add("ccc");
        System.out.println(sj);

        //返回长度
        int len = sj.length();
        System.out.println(len);

        //返回字符串
        String str = sj.toString();
        System.out.println(str);
    }
}
