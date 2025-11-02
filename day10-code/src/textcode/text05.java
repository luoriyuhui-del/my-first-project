package textcode;

public class text05 {
    public static void main(String[] args) {
        String num1 = "19";
        String num2 = "21";
        int i = get(num1);
        int j = get(num2);
        int sum = i * j ;
        String str = sum + "";
        System.out.println(str);


//        String result = get(num1 , num2) + "";
//        System.out.println(result);
    }

    // ----------------------- 菜鸟解法 -------------------------
    public static int get(String num){
        int result = 0;
        for (int i = 0; i < num.length(); i++) {
            result *= 10 ;
            int count = num.charAt(i) - '0';
            result += count;
        }
        return result;
    }

    // ----------------------- 优解 -------------------------
//    public static int get(String num1 , String num2){
//        int n1 = Integer.parseInt(num1);
//        int n2 = Integer.parseInt(num2);
//        return n1 * n2;
//    }
}
