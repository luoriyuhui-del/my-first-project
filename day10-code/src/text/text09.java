package text;

import java.util.Scanner;

public class text09 {
    public static void main(String[] args) {
        //键盘输入一个int类型的数组 , 创建一个方法将int数组中的数据按照指定格式拼接成一个字符串返回
        //并将结果打印到控制台
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入4个整数：");
        int[] arr = new int[4];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        String str = ArrToString(arr);

        System.out.println( str );
    }


    //创建方法 , 将int数组中的数据拼接成字符串
    public static String ArrToString( int[] arr ){
        if( arr == null ){
            //判断数组是否为null
            return "";
        }

        if( arr.length == 0 ){
            //判断数组长度是否为0
            return "[]";
        }

        //当int数组不为 null 长度也不为 0 时 , 拼接字符串
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            //判断是否是最后一个元素
            if( i == arr.length - 1 ){
                str = str + arr[i];
            }else{
                int n = arr[i];
                str = str + n + ", ";
            }
        }
        str = str + "]";
        return str;
    }
}
