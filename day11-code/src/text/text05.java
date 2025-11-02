package text;

import java.util.ArrayList;
import java.util.Scanner;

public class text05 {
    public static void main(String[] args) {
        //定义一个集合 , 存入三个用户对象 --- 用户类属性为 : id 姓名 密码
        //要求 : 定义一个方法 , 根据id查找对应的用户信息 1 . 如果存在 返回索引 2 . 如果不存在 返回-1
        ArrayList<User> list = new ArrayList<>();
        User s1 = new User("lin1001" , "张三" , "123456");
        User s2 = new User("wei1002" , "李四" , "123456");
        User s3 = new User("cong1003" , "王五" , "123456");

        //添加用户到集合中
        list.add(s1);
        list.add(s2);
        list.add(s3);

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要查询的用户id");
        String id = sc.nextLine();
        int count = getUser(list , id);
        System.out.println("与id匹配的索引位置为" + count);
    }

    // 定义方法 查询用户
    //需要提供两个参数 1.集合 2.id
    //返回值类型 boolean
    public static int getUser(ArrayList<User> list , String id){
        boolean flag = false;
        int count = 0 ;//记录存在id的索引
        for (int i = 0; i < list.size(); i++) {
            //flag = list.get(i).getId().equals(id); --- 优化 链接式
            User u = list.get(i);
            String num = u.getId();
            if( num.equals( id ) ){
                flag =  true;
                count = i;
                return count;
            }
        }
        return -1 ;
    }
}
