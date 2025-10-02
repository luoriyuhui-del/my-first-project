package text;

public class text01 {
    public static void main(String[] args) {
        int [] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = i ;
        }
        int count = arr.length;
        math( arr , count );
    }
    public static void math(int [] arr1 , int x){
        System.out.print("[");
        for (int i = 0; i < x; i++) {
            if( i == x-1 ){
                System.out.print( arr1[i] );
            }
            else{
                System.out.print( arr1[i] + " , ");
            }
        }
        System.out.print("]");
    }

}
