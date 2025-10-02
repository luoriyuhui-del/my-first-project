package text;

public class text03 {
    public static void main(String[] args) {
        double arr[] = {12.9, 53.54, 75.0, 99.1, 3.14};
        double sum = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if( sum > arr[i]){
                sum = arr[i];
            }
        }
       System.out.print( sum );

    }
}
