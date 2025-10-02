package text;

public class text09 {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5,6,7,8,9,10};

        int []arr2 = copyOf(arr1, 5);
        for (int i = 0; i < arr2.length; i++) {
            System.out.print( arr2[i] + " ");
        }
    }

    public static int[] copyOf(int[] arr, int newLength){
        int []arr2 = new int[newLength];
        for (int i = 0; i < newLength ; i++) {
            arr2[i] = arr[i];
        }
        return arr2;
    }
}
