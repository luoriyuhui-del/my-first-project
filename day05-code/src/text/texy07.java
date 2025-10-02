package text;

import java.util.Scanner;

public class texy07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个数字：");
        int number = scanner.nextInt();
        int [] arr = {12,14,23,45,66,68,70,77,90,91};
        int [] arr2 = new int[arr.length + 1 ];
        int i = 0 , count = 0 ;
        for ( i = 0; i < arr.length; i++) {
            if( arr[i] < number){
                arr2[i] = arr[i];
                count = i + 1 ;
            }
            else{
                arr2[i + 1 ] = arr[i];
            }
        }
        arr2[count] = number ;
        for (int k = 0; k < arr2.length; k++) {
            System.out.print( arr2[k] + " ");
        }
    }
}
