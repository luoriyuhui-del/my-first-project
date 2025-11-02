package wolk;

import java.util.Random;

public class text01 {
    public static void main(String[] args) {
        // 提示：使用冒泡排序算法
        //调用Random类
        Random r = new Random();
        // 创建一个长度为20的数组，使用for循环为数组元素添加为0-100之间的随机数
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            // 使用Random类生成0-100之间的随机数 , 并将随机数赋给数组的元素
            arr[i] = r.nextInt(101);
        }
        // 使用for循环对数组进行冒泡排序 , 第一层循环控制数组的元素个数 , 第二层循环控制数组的元素比较和交换
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                // 如果当前元素比下一个元素大 , 则交换位置
                if (arr[j] > arr[j + 1]) {
                    // 使用变量temp保存当前元素
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        // 使用for循环输出打印数组元素 , 每5个元素换行
        for (int i = 0; i < arr.length; i++) {
            if (i % 5 == 0) {
                System.out.println();
            }
            System.out.print(arr[i] + " ");
        }
    }
}
