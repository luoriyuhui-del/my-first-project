package text;

public class text15 {
    public static void main(String[] args) {
        //--------------------- StringBuilder --------------------
        //StringBuilder()是创建一个空的可变字符串对象 , 它不会产生多余的字符串 , 字符串对象中的内容是可变的
        //String所创建的字符串对象中内容不可变 , 每次创建新的字符串对象 , 所以会占用大量空间 , 效率低下
        StringBuilder sb = new StringBuilder("abc");

        //StringBuilder append()方法 --- 往sb里添加内容
        sb.append("abc").append("def").append("ghi");
        System.out.println(sb);

        //StringBuilder reverse()方法 --- 反转字符串 ( 反转容器中的内容 )
        sb.reverse();//反转字符串 --- 无形参
        //System.out.println(sb);

        //StringBuilder length()方法 --- 获取字符串的长度
        //int count = sb.length();
        //System.out.println(count);

        //StringBuilder insert()方法 --- 插入字符串
        //insert(索引 , 插入的字符串) --- 索引为1的位置插入字符串abc
        //sb.insert(2,"abc");
        //System.out.println(sb);

        //StringBuilder toString()方法 --- 将StringBuilder对象转换成String对象
        String str = sb.toString();
        System.out.println(str);
    }
}
