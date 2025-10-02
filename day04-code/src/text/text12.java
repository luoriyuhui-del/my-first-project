package text;

public class text12 {
    public static void main(String[] args) {
        int i = 1 , j = 0 ;
        for( i = 1 ; i <= 100 ; i++){
            if( i % 7 == 0 || ( i % 10 == 7 ) || ( i / 10 == 7 )){
                System.out.println( "逢七过");
                j++;
                continue;
            }
            System.out.println( i );
        }
        System.out.println( j );
    }
}
