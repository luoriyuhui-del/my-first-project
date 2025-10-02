package text;

import java.util.Random;

public class text11 {
    public static void main(String[] args) {
        Random r = new Random();
        int []arr = {2,588,888,1000,10000};
        int []brr = new int[5];
        int num = r.nextInt(5) ;
        int count = 0 , i = 0;

        extracted(count, arr, brr, num, i);
    }

    private static void extracted(int count, int[] arr, int[] brr, int num, int i) {
        while ( count < arr.length ) {
            if( brr[num] == arr[i]){
                count++;
                i++;
            }
        }
    }
}
