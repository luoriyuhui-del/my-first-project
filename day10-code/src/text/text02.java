package text;

public class text02 {
    public static void main(String[] args) {
        //----直接赋值 ( 直接赋值的字符串变量是存储在堆内存中的字符串池中的
        //-----如果有相同的内存存在时不会在创建新的内容 : 会直接复用已存在的值 )
        //第二种创建字符串变量 只要是new 创建的字符串变量是存储在堆内存中的 它们不会进行复用操作 ---- 变量名存储的也是地址值

        //第一种创建字符串变量-----直接赋值 ( 直接赋值的字符串变量是存储在堆内存中的字符串池中的
        // 如果有相同的内存存在时不会在创建新的内容 : 会直接复用已存在的值 )
        String str = "直接赋值法";
        System.out.println(str);

        //第二种创建字符串变量-----new( 比较无用 )
        String str1 = new String("new法");
        System.out.println(str1);

        //第三种创建字符串变量-----char[]
        //如果需要更改字符串 , 可以通过数组索引更改数组变量 , 再进行拼接字符串变量赋值
        //ch = { 'a' , 'b' , 'c'}  --->  { 'd' , 'e' , 'q '}  输出 deq
        char[] ch = {'a' , 'b' , 'c' };
        String str2 = new String(ch);
        System.out.println(str2);//abc

        //第四种创建字符串变量-----byte[]
        //在网络上传递的都是字节信息 , 需要将字节信息转换成字符串变量
        byte[] b = {97 , 98 , 99 , 100};//---------unicode 码
        String str3 = new String(b);
    }
}
