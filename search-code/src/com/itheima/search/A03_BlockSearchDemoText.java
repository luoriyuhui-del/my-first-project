package com.itheima.search;

public class A03_BlockSearchDemoText {
    public static void main(String[] args) {
        //扩展的分块查找( 无规律的数据 )

        int[] arr = {27,22,30,40,36,13,19,16,20,7,10,43,50,48};
        //创建块对象信息
        Block1 b1 = new Block1(22,40,0,4);
        Block1 b2 = new Block1(13,20,5,8);
        Block1 b3 = new Block1(7,50,9,13);
        //创建索引表
        Block1[] blockArr = {b1,b2,b3};
        //定义一个变量用来记录要查找的元素
        int number = 48;
        //调用方法
        int index = getIndex(blockArr,arr,number);
        System.out.println(index);

    }

    //创建一个方法，用来实现分块查找
    public static int getIndex(Block1[] blockArr,int[] arr,int number){
        //1.确定number属于哪一个块当中 , 得到索引
        int indexBlock = findIndexBlock(blockArr,number);
        //System.out.println(indexBlock);

        if( indexBlock == -1 ){
            return -1;
        }
        //2.获取块的起始索引和结束索引
        int endIndex = blockArr[indexBlock].getEndIndex();
        int startIndex = blockArr[indexBlock].getStartIndex();
        //3.遍历
        for (int i = startIndex; i <= endIndex; i++) {
            if(arr[i] == number){
                return i;
            }
        }
        return -1;
    }

    //创建一个方法，用来确定number属于哪一个块当中
    public static int findIndexBlock(Block1[] blockArr,int number){
        for (int i = 0; i < blockArr.length  ; i++) {
            if(number >= blockArr[i].getMin() && number <= blockArr[i].getMax() ){
                return i;
            }
        }
        return -1;
    }

}

//创建一个Block1类 , 用来封装块对象信息
class Block1{
    private int max;
    private int min;
    private int startIndex;
    private int endIndex;

    public Block1() {
    }
    public Block1(int min, int max, int startIndex, int endIndex) {
        this.min = min;
        this.max = max;
        this.startIndex = startIndex;
        this.endIndex = endIndex;
    }

    public int getMax() {
        return max;
    }

    public void setMax(int max) {
        this.max = max;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    public int getEndIndex() {
        return endIndex;
    }

    public void setEndIndex(int endIndex) {
        this.endIndex = endIndex;
    }
}
