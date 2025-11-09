package com.itheima.a08regexdemo;

public class RegexDemo4 {
    public static void main(String[] args) {
         /*
            需求
            请编写正则表达式验证用户输入的手机号码是否满足要求。请编写正则表达式验证用户输入的邮箱号是否满足要求。请编写正则表达式验证用户输入的电话号码是否满足要求。
            验证手机号码 13112345678 13712345667 13945679027 139456790271
            验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434
            验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        */

        //正则表达式不要从全局区域开始写，要从局部区域开始写
        // 比如 : 1 : 表示手机号码第一位只能是数字 "1"
        //  [3 - 9] : 表示手机号码第二位只能是3-9之间的数字
        // [0-9] : 表示手机号码第三位只能是0-9之间的数字
        //  {9}  : 表示[0-9]这个范围的数字可以出现9次
        String regex = "1[3-9][0-9]{9}";
        String phone = "13112345678";
        boolean b = phone.matches(regex);
        System.out.println(b);
        System.out.println("===================");
        System.out.println("13712345667".matches( regex));//表示用手机号码这个字符串去调用matches方法，参数里是正则表达式regex
        System.out.println("13945679027".matches( regex));
        System.out.println("139456790271".matches( regex));//为false , 因为正则表达式要求手机号码的长度是11位

        System.out.println("===================");
        //验证座机电话号码 020-2324242 02122442 027-42424 0712-3242434    "[0-9a-zA-Z]+@[0-9a-zA-Z]+\\.[a-zA-Z]+(\\.[a-zA-Z]+)?";
        //座机电话号码
        //020-2324242 02122442 027-42424 0712-3242434
        //思路:
        //在书写座机号正则的时候需要把正确的数据分为三部分
        //一:区号0\\d{2,3}
        //      0:表示区号一定是以0开头的
        //      \\d{2,3}:表示区号从第二位开始可以是任意的数字，可以出现2到3次。
        //二:- ?表示次数，0次或一次
        //三:号码 号码的第一位也不能以0开头，从第二位开始可以是任意的数字，号码的总长度:5-10位
        String regex2 = "0\\d{2,3}-?[1-9]{5,9}";
        System.out.println("020-2324242".matches(regex2));
        System.out.println("02122442".matches(regex2));
        System.out.println("027-42424".matches(regex2));
        System.out.println("0712-3242434".matches(regex2));

        System.out.println("===================");
        //验证邮箱号码 3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //邮箱号码
        //3232323@qq.com zhangsan@itcast.cnn dlei0009@163.com dlei0009@pci.com.cn
        //思路:
        //在书写邮箱号码正则的时候需要把正确的数据分为三部分
        //第一部分:@的左边 \\w+
        //      任意的字母数字下划线，至少出现一次就可以了
        //第二部分:@ 只能出现一次
        //第三部分:
        //      3.1         .的左边[\\w&&[^_]]{2,6}
        //                  任意的字母加数字，总共出现2-6次(此时不能出现下划线)
        //      3.2         . \\.  -- " . " : 表示任意的字符 ;  " \\. " : 表示 .
        //      3.3         大写字母，小写字母都可以，只能出现2-3次[a-zA-Z]{2,3}
        //      我们可以把3.2和3.3看成一组，这一组可以出现1次或者两次
        String regex3 = "\\w+@\\w{2,6}\\.[a-zA-Z]+(\\.[a-zA-Z]+){2,3}";
        System.out.println("3232323@qq.com".matches(regex3));
        System.out.println("zhangsan@itcast.cnn".matches(regex3));
        System.out.println("dlei0009@163.com".matches(regex3));
        System.out.println("dlei0009@pci.com.cn".matches(regex3));

        System.out.println("===================");
        //时间正则表达式 :   已添加正则表达式插件
        String regex4 = "([01]\\d|2[0-3]):[0-5]\\d:[0-5]\\d";
        System.out.println("23:11:11".matches(regex4));

        //把分和秒用括号括起来，然后重复
        String regex5 = "([01]\\d 2[0-3])(:[0-5]\\d){2}";
        System.out.println("23:11:11".matches(regex5));
    }
}
