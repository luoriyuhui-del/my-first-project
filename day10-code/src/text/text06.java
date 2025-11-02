package text;

import java.util.Random;

public class text06 {
    public static void main(String[] args) {
        String []arr = {"java" , "Web"};
        Random r = new Random();
        int index = r.nextInt(arr.length);
        System.out.println(arr[index]);
    }
}
