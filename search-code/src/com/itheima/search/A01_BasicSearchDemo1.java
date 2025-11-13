package com.itheima.search;

public class A01_BasicSearchDemo1 {
    public static void main(String[] args) {
        // ---------------------------------- 基础搜索算法 ----------------------------------

        //在数组中查找指定的元素
        String[] girlFriends = {"小林" , "小伟" , "小聪"};
        String target = "小林";
        boolean result = search(girlFriends, target);
        System.out.println(result);
    }

    public static Boolean search(String[] array , String target) {
        for (int i = 0; i < array.length; i++) {
            if(array[i].equals(target)){
                return true;
            }
        }
        return false;
    }
}
