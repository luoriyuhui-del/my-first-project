package a02staticdemo2;

public class ArrayUtil {
    // ---------------------------------- 工具类 ----------------------------------
    // 定义一个工具类    方法，实现数组的基本功能
    private ArrayUtil(){}//构造方法( 对象 )私有化 --- 成员方法调用时，必须创建对象

    // 打印数组
    public static String printArray(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++) {
            if( i == arr.length - 1 ){
                sb.append(arr[i]);
            }else{
                sb.append(arr[i]).append(", ");
            }
        }
        sb.append("]");
    return sb.toString();
    }

    // 获取数组最大值
    public static int getMax(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] > max ){
                max = arr[i];
            }
        }
        return max;
    }

    // 获取数组最小值
    public static int getMin(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if( arr[i] < min ){
                min = arr[i];
            }
        }
        return min;
    }

    // 获取数组平均值
    public static double getAverage(double[] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum / arr.length;
    }
}
