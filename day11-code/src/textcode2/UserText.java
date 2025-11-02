package textcode2;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class UserText {
    public static void main(String[] args) {
        // ----------------------------- 登录系统加操作系统实操练手 -----------------------------

        //创建集合存放用户对象信息
        ArrayList<User> list = new ArrayList<>();

        //首先创建主界面
        System.out.println("-------------- 欢迎来到用户管理系统 -------------");

        //让用户选择其操作 --- switch
        Scanner sc = new Scanner(System.in);
        loop : while (true) {
            System.out.println("请选择你的操作 : ");
            System.out.println("1. 登录");
            System.out.println("2. 注册");
            System.out.println("3. 忘记密码");
            System.out.println("4. 打印存储信息");
            String choice = sc.next();
            switch(  choice ){
                case "1" -> {
                    int result = login( list );
                    switch (result){
                        case 1 -> {
                            break loop;
                        }
                        case 2 -> {
                            System.out.println("登录失败");
                        }
                        case 3 -> {
                            break;
                        }
                    }
                }
                case "2" -> {
                    register( list );
                }
                case "3" -> {
                    int result = forgetPassword( list );
                    switch (result){
                        case 0 -> {
                            System.out.println("可以进行登录:");
                            break ;
                        }
                        case 1 -> { }
                        case 2 -> {
                            System.out.println("要尝试再次修改密码吗:");
                        }
                    }
                }
                case "4" -> {
                    System.out.println("打印存储信息");
                    for (int i = 0; i < list.size(); i++) {
                        User u = list.get(i);
                        System.out.println(u.getUsername() + " " + u.getPassword() + " " + u.getIdcard() + " " + u.getPhone());
                    }
                }
                case "5" -> {
                    System.out.println("欢迎下次再来");
                    break loop;
                }
                default -> {
                    System.out.println("请输入正确的选项");
                }
            }
        }
    }

    // ------------------------------- 登录功能 -----------------------------------------
    //创建方法 --- 登录功能
    public static int login(ArrayList<User> list){
        //创建User对象
        User u = new User();

        int count = 3;
        while (count > 0) {
            //输入用户名 密码 ----- 并判断用户名是否存在
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入用户名:");
            String username = sc.next();
            if( containsNew(list , username) ){
                u.setUsername(username);
            }else{
                System.out.println("用户名不存在 , 请先注册");
                return 3;
            }

            //输入密码
            System.out.println("请输入密码:");
            String password = sc.next();
            u.setPassword(password);

            //输入验证码
            loop : while (true) {
                String code = createCode();
                System.out.println("验证码是：" + code);
                System.out.println("请输入验证码:");
                String codeNew = sc.next();
                if( code.equals(codeNew )){
                    for (int i = 0; i < list.size(); i++) {
                        User u2 = list.get(i);
                        if (u2.getUsername().equals(username) && u2.getPassword().equals(password)) {
                            System.out.println("登录成功");
                            //登录成功 , 进入学生管理系统
                            StudentSystem ss = new StudentSystem();
                            ss.startStudentSystem();
                            return 1;
                        }
                    }
                    System.out.println("用户名或密码错误 , 还剩" + (count - 1) + "次机会");
                    count--;
                    break loop;
                }else{
                    System.out.println("验证码错误 , 请重新输入:");
                }
            }
        }

        return 2;
    }

    //创建方法 --- 判断用户是否已注册
    public static boolean containsNew(ArrayList<User> list , String username){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if( u.getUsername().equals(username) ){
                return true;
            }
        }
        return false;
    }

    // ------------------------------- 注册功能 -----------------------------------------
    //创建方法 --- 注册功能
    public static void register(ArrayList<User> list){
        //创建用户对象User
        User u = new User();
        Scanner sc = new Scanner(System.in);

        //创建用户名 --- 并判断用户名是否唯一 , 用户名长度3 - 15 位 , 只能是字母和数字 -- 但不能是纯数字
        String username;
        while (true) {
            System.out.println("请输入用户名:");
            username = sc.next();
            if(  !checkLength(username) ){
                System.out.println("用户名长度3 - 15 位 , 请重新输入");
            }else if( !checkLetterAndNumber(username)  ){
                System.out.println("用户名只能是字母和数字 , 请重新输入");
            }else if( contains(list , username)){
                System.out.println("用户名已存在 , 请重新输入");
            }else{
                System.out.println(username + "用户名可以使用");
                u.setUsername(username);
                break;
            }
        }

        //输入两次密码要一致才能 注册
        while (true) {
            System.out.println("请输入密码:");
            String password = sc.next();
            System.out.println("请再次输入密码:");
            String password2 = sc.next();
            if( password.equals(password2) ){
                u.setPassword(password);
                break;
            }else{
                System.out.println("两次密码不一致 , 请重新输入");
                continue;
            }
        }

        //输入身份证号码 --- 验证身份证号码 : 长度为18位 , 不能以0开头 , 前17位都是数字 , 最后一位可以是数字或者大写字母X
        while (true) {
            System.out.println("请输入身份证号码:");
            String idcard = sc.next();
            if( !checkIdcard(idcard) ){
                System.out.println("身份证号码长度18位 , 请重新输入");
            }else if( !checkIdcard2(idcard)   ){
                System.out.println("身份证号码不能以0开头 , 请重新输入");
            }else if( !checkIdcard3(idcard) ){
                System.out.println("身份证号码前17位都是数字 , 请重新输入");
            }else if( !checkIdcard4(idcard) ){
                System.out.println("身份证号码最后一位可以是数字或者大写字母X , 请重新输入");
            }else{
                u.setIdcard(idcard);
                break;
            }
        }

        //输入手机号码 --- 验证手机号码 : 长度为11位 , 不能以0开头 , 必须全是数字
        while (true) {
            System.out.println("请输入手机号码:");
            String phone = sc.next();
            if( !checkPhone( phone ) ){
                System.out.println("手机号码长度11位 , 请重新输入");
            }else if( !checkPhone2( phone ) ){
                System.out.println("手机号码不能以0开头 , 请重新输入");
            }else if( !checkPhone3(phone) ){
                System.out.println("手机号码必须全是数字 , 请重新输入");
            }else{
                u.setPhone(phone);
                break;
            }
        }

        System.out.println("注册成功");
        list.add(u);
    }

    //创建方法 --- 判断输入的用户名是否唯一 ---------- 注册 用户名 -----------
    public static boolean contains(ArrayList<User> list , String username){
        for (int i = 0; i < list.size(); i++) {
            User u = list.get(i);
            if( u.getUsername().equals(username) ){
                return true;
            }
        }
        return false;
    }

    //创建方法 --- 判断用户名长度3 - 15 位  ------------ 注册 用户名 ------------
    public static boolean checkLength(String username){
        //username是字符串 , 所以用length()方法获取字符串的长度
        int len = username.length();
        return len >= 3 && len <= 15;
    }

    //创建方法 --- 判断是否是字母加数字的组合 , 不能是纯数字 ---------- 注册 用户名 ----------
    public static boolean checkLetterAndNumber(String username){
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            //遍历字符串username中的每一个字符c , 判断c是否是字母或者数字 --- 如果不是返回 false  /  遍历结束 返回 true
            if( !((c >= '0' && c <= '9' ) || (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z')) ){
                return false;
            }
        }
        //判断用户名中是否是纯数字
        for (int i = 0; i < username.length(); i++) {
            char c = username.charAt(i);
            //遍历字符串username中的每一个字符c , 找到一个字母就返回 true
            if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') ){
                return true;
            }
        }
        //纯数字 --- 返回 false
        return false;
    }

    //创建方法 --- 验证身份证号码 : 长度为18位 ---------- 注册 身份证 ----------
    public static boolean checkIdcard(String idcard){
        return idcard.length() == 18;
    }

    //创建方法 --- 验证身份证号码 : 不能以0开头 ---------- 注册 身份证 ----------
    public static boolean checkIdcard2(String idcard){
        return idcard.charAt(0) != '0';
    }

    //创建方法 --- 验证身份证号码 : 前17位都是数字 ---------- 注册 身份证 ----------
    public static boolean checkIdcard3(String idcard){
        for (int i = 0; i < idcard.length() - 1; i++) {
            char c = idcard.charAt(i);
            if( !(c >= '0' && c <= '9') ){
                return false;
            }
        }
        return true;
    }

    //创建方法 --- 验证身份证号码 : 最后一位可以是数字或者大写字母X ---------- 注册 身份证 ----------
    public static boolean checkIdcard4(String idcard){
        char c = idcard.charAt(idcard.length() - 1);
        return (c >= '0' && c <= '9') || c == 'X' || c == 'x';
    }

    //创建方法 --- 验证手机号码 : 长度为11位 ---------- 注册 手机号 ----------
    public static boolean checkPhone(String phone){
        return phone.length() == 11;
    }

    //创建方法 --- 验证手机号码 : 不能以0开头 ---------- 注册 手机号 ----------
    public static boolean checkPhone2(String phone){
        return phone.charAt(0) != '0';
    }

    //创建方法 --- 验证手机号码 : 必须全是数字 ---------- 注册 手机号 ----------
    public static boolean checkPhone3(String phone){
        for (int i = 0; i < phone.length(); i++) {
            char c = phone.charAt(i);
            if( !(c >= '0' && c <= '9') ){
                return false;
            }
        }
        return true;
    }

    // ------------------------------- 忘记密码 -----------------------------------------
    public static int forgetPassword(ArrayList<User> list){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名:");
        String username = sc.next();
        //判断用户名是否存在
        if( !contains(list , username) ){
            System.out.println("用户名不存在 , 请先注册:");
            return 1 ;
        }
        //输入身份证号码
        System.out.println("请输入身份证号码:");
        String idcard = sc.next();

        //输入密码
        System.out.println("请输入手机号码:");
        String phone = sc.next();


        for (int i = 0; i < list.size(); i++) {
            User u1 = list.get(i);
            if( u1.getUsername().equals(username) && u1.getIdcard().equals(idcard) && u1.getPhone().equals(phone) ){
                while (true) {
                    System.out.println("请输入你新的密码:");
                    String newPassword = sc.next();
                    System.out.println("再输入一次新密码:");
                    String newPassword2 = sc.next();
                    if( newPassword.equals(newPassword2) ){
                        u1.setPassword(newPassword);
                        System.out.println("修改密码成功");
                        return 0;
                    }else{
                        System.out.println("两次输入的密码不一致 , 请重新输入");
                    }
                }
            }
        }
        System.out.println("账号信息不匹配 , 修改失败 ");
        return 2;
    }

    // ---------------------------------- 创建验证码 --------------------------------------
    //验证码规则 : 长度为5位 , 随机生成 , 由四位大小写字母和一位数字组成 , 数字的位置是随机的
    public static String createCode(){
        Random r = new Random();
        StringBuilder sb = new StringBuilder();

        //创建随机数来放置验证码中数字的位置
        int numberIndex = r.nextInt(5);

        for (int i = 0; i < 5; i++) {
            //判断当前位置是不是数字的位置
            if( i == numberIndex ){
                sb.append(r.nextInt(10));
            }else{
                //生成大小写字母
                int index = r.nextInt(2);
                char indexChar;
                if( index == 0 ){
                    indexChar = (char)(r.nextInt(26) + 'a');
                }else{
                    indexChar = (char)(r.nextInt(26) + 'A');
                }
                sb.append(indexChar);
            }
        }
        return sb.toString();
    }
}
