package a02staticdemo2;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        // ctrl + alt + v  自动生成变量
        String s = ArrayUtil.printArray(arr);
        System.out.println(s);

        double[] arr2 = {1.1,2.2,3.3,4.4,5.5};
        double average = ArrayUtil.getAverage(arr2);
        System.out.println("arr2数组中的平均值为" + average);

        int max = ArrayUtil.getMax(arr);
        System.out.println("arr数组中的最大值为" + max);
        int min = ArrayUtil.getMin(arr);
        System.out.println("arr数组中的最小值为" + min);
    }
}
