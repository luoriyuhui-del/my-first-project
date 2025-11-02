package textcode;

import java.util.Scanner;

public class text07 {
    public static void main(String[] args) {
        //输出身份证判断是否符合格式 : 号码为18位，不能以数字0开头，前17位只可以是数字，最后一位可以是数字或者大写字母X。
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个身份证号码 - 18位:");
        String id = sc.next();
        boolean flag = true;
        if( id.length() == 18 ){
            flag = isFlag(id, flag);
        }else{
            System.out.println("输入的身份证号码长度不对");
            flag = false;
        }
        if(flag){
            System.out.println("输入的身份证号码合法");
        }
    }

    private static boolean isFlag(String id, boolean flag) {
        for (int i = 0; i < id.length(); i++) {
            char c = id.charAt(i);
            if( c == '0' ){
                System.out.println("不能以0开头");
                flag = false;
                break;
            }else if( i < 17 ){
                if( c >= '0' && c <= '9' ){
                    continue;
                }else{
                    flag = false;
                    break;
                }
            }else{
                if( c >= '0' && c <= '9' || c == 'X'){
                    continue;
                }else{
                    flag = false;
                    System.out.println("输入的身份证最后一位有误");
                    break;
                }
            }
        }
        return flag;
    }
}
