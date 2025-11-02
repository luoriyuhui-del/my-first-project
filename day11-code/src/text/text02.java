package text;

import java.util.ArrayList;

public class text02 {
    public static void main(String[] args) {
        //定义一个集合 , 添加字符串 , 并进行遍历
        //遍历格式 : [元素1 , 元素2 , 元素3]. --- 注意 : 遍历不等于打印
        ArrayList<String> list = new ArrayList<>();
        list.add("早上好");
        list.add("吃早饭了么");
        list.add("昨晚休息的怎么样");
        // ---------- 遍历是依次获取集合中的元素 , 获取元素格式 : 集合对象.get(索引)
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if( i == list.size() - 1 ){
                System.out.print(list.get(i));
            }else{
                System.out.print(list.get(i) + " , ");
            }
        }
        System.out.println("]");
    }
}
