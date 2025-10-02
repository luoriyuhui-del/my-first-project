package text;

public class text03 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5,6,7,8,9,10};


        int[] arr2 = math(arr,2,6);
        for (int i = 0; i < arr2.length ; i++) {
            System.out.print(arr2[i] + " ");
        }
    }
    public static int[] math(int [] arr1 , int num1 , int num2){
        int [] arr2 = new int[num2 - num1];
        int j = 0 ;
        for (int i = num1; i < num2; i++) {
                arr2[j] = arr1[i];
                j++;
        }
        return arr2;
    }
}
