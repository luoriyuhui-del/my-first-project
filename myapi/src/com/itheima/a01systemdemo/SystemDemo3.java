package com.itheima.a01systemdemo;

public class SystemDemo3 {
    public static void main(String[] args) {
        // -------------------- system类中的arraycopy()方法 --------------------

        //注意点 : 1. 如果数据源数组和目的数组都是基本数据类型的 , 那么两者的数据类型要一致 , 不然会报错
        // 2. 如果目的数组的长度小于数据源数组的长度 , 那么会报错
        // 3. 如果数据源数组和目的数组都是引用数据类型的 , 那么子类类型可以赋值给父类类型

        // arraycopy(Object src, int srcPos, Object dest, int destPos, int length)
        // 参数: src:源数组 srcPos:源数组的起始索引 dest:目标数组 destPos:目标数组的起始索引 length:复制的长度
        int[] src = {1,2,3,4,5};
        int[] dest = new int[10];
        // 将src数组的数据复制到dest数组中
        System.arraycopy(src, 0, dest, 0, src.length);
    }
}
