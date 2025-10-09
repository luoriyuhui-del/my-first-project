package text03;

public class text {
    public static void main(String[] args) {
        //----------------解释输入的问题-----------------

        //请注意 键盘录入的两套体系不能混用
        //弊端 : 先用nextInt , 在用nextLine会导致下面的nextLine()方法接收不到数据
        //键盘录入
        //第一套体系
        //nextInt(); 接收整数
        //nextDouble(); 接收小数
        //next(); 读取一个字符串
        //遇到空格 制表符 回车 结束

//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入第一个整数：");
//        //当你输入123 空格 234 回车 123遇到空格就结束赋值给a , 234 回车就结束赋值给b
//        int a = sc.nextInt();
//        System.out.println( a );//123
//        System.out.println("-----------------------------");
//        System.out.println("请输入第二个整数：");
//        int b = sc.nextInt();
//        System.out.println( b );//234

        //第二套体系
        //nextLine(); 读取一行字符串
        //可以接收空格 制表符 , 遇到回车才结束接收数据

//        Scanner sc = new Scanner(System.in);
//        //键盘录入一个字符串abc 空格 bcd 回车 , str中存取的是abc bcd
//        System.out.println("请输入一个字符串：");
//        String str = sc.nextLine();
//        System.out.println( str );
//        System.out.println("-----------------------------");
//        //在第一次输入数据回车后，第二次输入数据回车
//        System.out.println("请输入第二个字符串：");
//        String str2 = sc.nextLine();
//        System.out.println( str2 );
    }
}
