package com.itherma.code;

public class text04 {
    public static void main(String[] args) {
        int []arr = {1,2,3,4,5,6,7,8,9,10};
        int []arr2 = get(arr);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] get(int []arr){
        int []arr2 = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
