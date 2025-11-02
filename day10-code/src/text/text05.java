package text;

import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        String account = "Lin";
        String password = "123";

        Scanner sc = new Scanner(System.in);


        int count = 3 ;
        while( count > 0  ){
            //输入账号和密码
            System.out.println("请输入账号：");
            String inputAccount = sc.next();
            System.out.println("请输入密码：");
            String inputPassword = sc.next();

            //判断账号密码是否正确
            if( inputAccount.equals(account) && inputPassword.equals(password)){
                System.out.println("登录成功");
                break;
            }else{
                count--;
                if( count > 0 ){
                    System.out.println("账号或密码错误，请重新输入 , 您还有" + count + "次机会");
                }else{
                    System.out.println("登录失败");
                }
            }

        }

    }
}
