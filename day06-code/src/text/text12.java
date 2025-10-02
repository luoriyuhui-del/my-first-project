package text;

import java.util.Random;

public class text12 {
    public static void main(String[] args) {
        // 创建随机数对象
        Random rand = new Random();


        int[] arr = {2,588,888,1000,10000};
        int[] brr = new int[arr.length];
        int index = 0 ;
        while( index < arr.length ){
            int num = rand.nextInt(5);
            if( !math(brr, arr[num]) ){
                System.out.println("抽中的奖金为: " + arr[num]);
                brr[index] = arr[num];
                index++;
            }
        }
       /* 1. 定义奖金的数组arr。
        2. 定义数组brr准备存放已经被抽过的奖金，两个数组长度相同。
        3. 定义一个变量index,用户代表数组brr的索引。
        4. 定义方法，判断数组中是否存在某数字，存在返回true,不存在返回false。
        5. 写一个while循环，如果index<arr.length则说明奖项没有被抽完继续抽取。
        6. 在循环中使用随机数产生一个随机索引i。
        7. 使用步骤4的方法判断brr数组中是否包含arr[i]奖金。
        8. 如果不包含，则打印arr[i]奖金，并且把它放入brr数组中代表已经被抽取过，同时index加一。*/
    }

    public static boolean math(int[] arr1 , int num){
        for (int i = 0; i < arr1.length; i++) {
            if( arr1[i] == num ){
                return true;
            }
        }
        return false;
    }
}
