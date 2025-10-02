package text;

import java.util.Random;

public class text07 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};
        Random r = new Random();
        int temp = 0 ;
        for (int i = 0; i < arr.length; i++) {
            int num = r.nextInt(arr.length);
            temp = arr[i];
            arr[i] = arr[ num ];
            arr[ num ] = temp;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[ i ] + " ");
        }
    }
}
