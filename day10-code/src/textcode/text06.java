package textcode;

import java.util.Scanner;

public class text06 {
    public static void main(String[] args) {
        //给定一个字符串 , 由若干个单词组成 , 单词前后用一些空格字符隔开 , 返回字符串最后一个单词的长度
        //我的思路 : 从字符串开始遍历 如果遇到字母
        //           遇到非字母则停止
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.nextLine();
        //StringBuilder sb = new StringBuilder();
        //定义字符串最后一位索引
        int end = str.length() - 1;
        //倒序遍历字符串 --- 遇到空格则停止
        while(end >= 0 && str.charAt(end) == ' '){
            end--;
        }
        //定义字符串最后一个字母开始开始索引
        int start = end ;
        while(start >= 0 && str.charAt(start) != ' '){
            start--;
        }
        String result = str.substring(start + 1 , end + 1);
        System.out.println(result);
        System.out.println(result.length());

//        for (int len = str.length() - 1 ; len > 0; len--) {
//            char c = str.charAt(len);
//            if( c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'){
//                sb.append(c);
//            }else{
//                break;
//            }
//        }
//        sb.reverse();
//        str = sb.toString();
//        System.out.println(str);
//        System.out.println(str.length());
    }
}
