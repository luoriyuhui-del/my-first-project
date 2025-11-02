package text;

import java.util.ArrayList;

public class text03 {
    public static void main(String[] args) {
        //如何在集合中添加基本数据类型 --- 通过包装类
        //类型 -------------- 包装类
        //byte -------------- Byte
        //short ------------- Short
        //char -------------- Character
        //int -------------- Integer
        //long -------------- Long
        //float ------------- Float
        //double ------------ Double

        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(0);
        list.add(2);
        list.add(5);
        list.add(21);
        //遍历集合
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
