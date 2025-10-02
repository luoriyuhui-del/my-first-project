package com.itheima.code;

public class arithmeicoperator04 {
    public static void main(String[] args) {
        int  []arr = { 1,2,3,4,5};
        int max = arr.length - 1 ;
        int min = 0 ;
        for( min = 0 ; min <= max ; min++ , max--){
            int temp = arr[min] ;
            arr[min] = arr[max] ;
            arr[max] = temp ;
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println( arr[i]);
        }

//        int [] arr1 = new int[count];
//        for (int i = 0 , j = arr.length - 1; i < arr.length; i++ , j--) {
//            arr1[j] = arr[i] ;
//        }
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.print( arr1[i]  + " ");
//        }
    }
}
