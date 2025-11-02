package text;

import java.util.ArrayList;

public class text01 {
    public static void main(String[] args) {
        //第十一天学习集合 --- ArrayList
        //创建ArrayList对象 --- 集合对象只能添加引用数据类型 ( 若要添加基本数据类型要通过包装类 )
        ArrayList<String> list = new ArrayList<>(); //--- 注意ArrayList 的 尖括号<> 一定要添加类型
        System.out.println(list);//当集合对象创建时，集合对象默认容量为10 , 当内容为空时 --- 集合对象返回 "[]"
        //方法名 :  ----  说明
        // ------------------------------- 增 ----------------------------------
        boolean flag = list.add("aaa"); // --- 添加元素 , 返回值为布尔值 --- 默认为添加成功( true )
        System.out.println(flag);
        System.out.println(list);
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");
        System.out.println(list);

        // ------------------------------- 删 ----------------------------------
        boolean flag1 = list.remove("aaa");// --- 删除元素 , 返回值为布尔值 --- 删除成功返回 true
        System.out.println(flag1);
        System.out.println(list);
        String remove = list.remove(1);// --- 删除元素 , 删除成功返回删除的元素 类型为 --- String
        System.out.println(remove);
        System.out.println(list);

        // ------------------------------- 改 ----------------------------------
        String set = list.set(0 , "ddd");// --- 修改元素 , 根据索引位置修改成功返回修改前的元素
        System.out.println(set);
        System.out.println(list);

        // ------------------------------- 查 ----------------------------------
        String get = list.get(1);// --- 获取指定索引的元素
        System.out.println(get);

        // ----------------------------- 获取长度 -------------------------------
        int size = list.size();// --- 获取集合的长度 , 也就是集合中元素的个数
        System.out.println(size);

    }
}
