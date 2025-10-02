package text;

public class text08 {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,7,8,9,10};

        fillfill(arr1, 2 , 6 , 6);
        for (int i = 0; i < arr1.length; i++) {
            System.out.print( arr1[i] + " ");
        }
    }

    public static void fillfill(int[] arr,int fromIndex,int toIndex,int value){
        for (int i = fromIndex ; i < value; i++) {
            arr[i] = value;
        }
    }
}
