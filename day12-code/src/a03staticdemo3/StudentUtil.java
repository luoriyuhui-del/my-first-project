package a03staticdemo3;

import java.util.ArrayList;

public class StudentUtil {
    // --------------------------- 工具类 ---------------------------
    private StudentUtil(){};

    //创建方法 , 获取数组中的最大值
    public static int studentMaxAge(ArrayList< Student> list){
        int max = 0;
        for (int i = 0; i < list.size(); i++) {
            int age = list.get(i).getAge();
            if( age > max ){
                max = age;
            }
        }
        return max;
    }
}
