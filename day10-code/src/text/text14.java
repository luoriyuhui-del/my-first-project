package text;

public class text14 {
    public static void main(String[] args) {
        //--------------------- 敏感词过滤 --------------------
        //String replace( 旧值 , 新值 ) --- 将字符串中的旧值替换成新的值
        //注意点 : 只有返回值才是替换之后的结果 ( 不是替换原来的字符串 ) --- 字符串的内容是不会改变的
        String talk = "你游戏玩的真好 , 建议别玩了 , TMD SB WRNM";

        String [] arr = {"TMD" , "CNM" , "WRNM" , "SB"};

        for (int i = 0; i < arr.length; i++) {
            talk = talk.replace(arr[i] , "***");
        }

        System.out.println(talk);
    }
}
