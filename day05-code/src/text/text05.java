package text;

import java.util.Random;

public class text05 {
    public static void main(String[] args) {
        Random rand = new Random();
        int[] arr = new int[6];
        int count = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int x = rand.nextInt(10)  ;
            arr[i] = x ;
        }
        for (int i = 0; i < arr.length; i++) {
            count = count * 10 + arr[i];
        }
        System.out.println(count);
    }
}
