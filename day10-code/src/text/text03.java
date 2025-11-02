package text;

//---------------------unicode码-----------------------
public class text03 {
    public static void main(String[] args) {
        // 定义一个包含 Unicode 字符的字符串
        String str = "Hello, 世界!";
        // 遍历字符串中的每个字符
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            // 输出字符及其 Unicode 码点
            System.out.printf("字符: %c, Unicode 码点: U+%04X%n", c, (int) c);
        }
    }
}
