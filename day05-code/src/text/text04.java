package text;

import java.util.Random;

public class text04 {
    public static void main(String[] args) {
        Random rand = new Random();
        int []arr = new int[6];
        for (int j = 0;  j < arr.length; j++) {
            int i = rand.nextInt(99) + 1 ;
            arr[ j ] =  i ;
        }
        for (int j = 0; j < arr.length; j++) {
            System.out.print( arr[j] + " ");
        }
    }
}
