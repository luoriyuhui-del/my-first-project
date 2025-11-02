package wolk;

public class text03 {
    public static void main(String[] args) {
        // 创建字符数组存储一到十二的月份名称
        String[] arr = {"January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        // 随机生成1到12的数字
        int n = (int)(1+Math.random()*12);
        // 打印随机生成的月份名称
        System.out.println("该月是" + arr[n]);
    }
}
