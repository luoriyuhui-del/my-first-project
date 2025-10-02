package text;

public class text07 {
    public static void main(String[] args) {
        int []arr1 = {1,2,3,4,5};
        int []arr2 = {1,2,3,4,5};

        System.out.println( equals(arr1,arr2) );
    }

    public static boolean equals(int[] arr1,int[] arr2){
        if( arr1.length != arr2.length){
            return false;
        }
        for(int i = 0; i < arr1.length; i++){
            if( arr1[i] != arr2[i]){
                return false;
            }
        }
        return true;
    }
}
