package text;

import java.util.Scanner;

public class text11 {
    public static void main(String[] args) {
        //金额反转 ---- 键盘录入金额 , 调用方法 , 输出结果
        Scanner sc = new Scanner(System.in);


        while( true ){

            System.out.println("请输入金额：金额为7位数");
            int money = sc.nextInt();

            //判断金额是否合法 -------- 只有符合大于0 小于 七位数 的才合法
            if( money >= 0 && money <= 9999999){
                //获取金额的位数
                int length = getLength(money);

                //创建方法将金额的每一位取出来放入一个数组
                int[] arr = get(money , length);

                //创建方法将数组中的数据转化为大写
                String big = getBig(arr);

                //创建方法将金额补齐到7位
                String BigMoney = getMoney(big , length);

                //创建方法给每一位补齐单位
                String unit = getUnit(BigMoney);
                System.out.println(unit);
                break;
            }
            else{
                System.out.println("输入金额有误 , 请重新输入 ");
            }
        }
    }

    //创建方法给每一位补齐单位
    public static String getUnit(String BigMoney ){
        //此时传入的值为7位
        String[] unit = {"佰","拾","万","仟","佰","拾","元"};
        String str =  "";
        for (int i = 0; i < BigMoney.length(); i++) {
            //获取每一位
            char c = BigMoney.charAt(i);
            //在每一位后面添加单位
            str = str + c + unit[i];
            //再次循环
        }
        return str;
    }

    //创建方法将金额补齐到7位
    public static String getMoney(String  big , int length){
        //创建变量保存补齐后的金额
        int count = 7 - length;
        //创建循环加零添加在金额前
        for (int i = 0; i < count; i++) {
            big = "零" + big;
        }
        return big;
    }

    //创建方法将金额中的每一位转化为大写并存入字符串中
    public static String getBig(int[] arr){
        String [] BigChine = {"零","壹","贰","叁","肆","伍","陆","柒","捌","玖"};
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str += BigChine[arr[i]];
        }
        return str;
    }

    //创建方法将金额的每一位取出来并放入数组
    public static int[] get(int money , int length){
        int[] arr = new int[ length ];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = money % 10 ;
            money /= 10;
        }
        return arr;
    }

    //创建方法判断金额是几位数
    public static int getLength(int money){
        int count = 0 ;
        while( money != 0 ){
            money /= 10 ;
            count++;
        }
        return count;
    }
}
