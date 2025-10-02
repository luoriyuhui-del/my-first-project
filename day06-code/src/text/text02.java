package text;

import java.util.Random;
import java.util.Scanner;

public class text02 {
    /**
     * main函数，程序的入口点。
     * 
     * @param args 命令行参数，未在此程序中使用
     */
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[10];
        // 初始化数组，用随机数填充数组
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(100);
        }
        // 提示用户输入一个数字
        System.out.println("请输入一个0到100的数字");
        int sum = sc.nextInt();

        System.out.println( math(arr,sum));
    }
    public static boolean math( int[] arr1 , int max){
        for (int i = 0; i < arr1.length; i++) {
            if(arr1[i] == max){
                return true;
            }
        }
        return false;
    }
}
