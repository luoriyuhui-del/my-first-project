public class textword {
    public static void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("请输入一个整数表示第一个范围:");
//        int a = sc.nextInt();
        int i = 1988 ;
        for( i = 1988 ; i <= 2019 ; i++){
            if( (i % 4 == 0 && i % 100 != 0 ) || i % 400 == 0 ){
                System.out.println(i + "是闰年");
            }
        }
    }
}

