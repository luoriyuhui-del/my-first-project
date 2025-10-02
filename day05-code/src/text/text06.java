package text;

public class text06 {
    public static void main(String[] args) {
        int [] arr = {72, 89, 65, 87, 91, 82, 71, 93, 76, 68};
        int sum = 0 ;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("平均成绩为" + sum / arr.length);
    }
}
