package text;

import java.util.Random;

public class text08 {
    public static void main(String[] args) {
        Random rand = new Random();
        int [] arr = new int[10];
        int [] arr2 = new int[10];
        for (int i = 0; i < arr.length; i++) {
            int x = rand.nextInt(100);
            arr[i] = x;
        }

        int num1  = 0 , num2= arr.length - 1 ;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] % 2 == 0 ){
                arr2 [num2] = arr[i];
                num2--;
            }
            else{
                arr2[num1] = arr[i];
                num1++;
            }
        }
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] + " ");
        }
    }
}
