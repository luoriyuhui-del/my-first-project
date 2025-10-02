package com.itheima.code;

import java.util.Random;

public class text07 {
    /**
     * 主函数，用于模拟奖金抽取过程。
     *
     * @param args 命令行参数
     * @return 无返回值
     */
    public static void main(String[] args) {
        Random r = new Random();
        int count = 0;
        int[] arr = {1, 2, 88, 888, 1000, 8888};
        // 开始抽奖循环，直到所有奖金都被抽取
        while (count < arr.length) {
            // 生成随机索引
            int num = r.nextInt(arr.length);

            // 检查选中的奖金是否未被抽取
            if (arr[num] != 0) {
                if (arr[num] == 1) {
                    System.out.println("运气不好哦 谢谢惠顾");
                } else {
                    System.out.println(arr[num] + "元的奖金已被抽出");
                }
                arr[num] = 0; // 标记该奖金已被抽取
                count++;
            }
        }
        System.out.println("奖金池以抽取完毕");
    }
}
