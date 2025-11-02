package text07;

import java.util.Scanner;

public class StudentText {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //创建数组存取Student对象
        Student []arr = new Student[3];

        //创建对象并存入数组中
        Student s1 = new Student("小林",22,1);
        Student s2 = new Student("小钟",23,2);
        Student s3 = new Student("小聪",22,3);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;
        //创建新的对象
        Student s4 = new Student("小媛",23,4);

        //将新对象添加到数组中需要判断学号ID是否重复
        boolean flag = contains(arr,s4.getId());

        //创建新的数组
        Student []NewArr = new Student[arr.length + 1];

        //判断---输入
        if( flag ){
            //学号重复 , 无需添加
            System.out.println("学号重复");
        }else{
            //学号不重复 , 需要添加
            //添加需要判断数组中是否有空 / 数组已满 ( 需要新建数组 , 长度为arr.length)
            //怎么判断数组中已满 ----- 创建方法求得数组中存放的元素个数
            int count = getCount(arr);
            if( count == arr.length ){
                //数组已满----需要创建新的数组 , 长度为arr.length + 1
                NewArr = copyNewArr(arr);
                NewArr[count] = s4;
                extracted(NewArr);
            }else{
                //数组未满
                arr[count] = s4;
                extracted(arr);
            }
        }


    }

    private static void extracted(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //当数组未满输出的是原数组中的元素arr
            //当数组已满输出的是新数组中的元素NewArr
           if( stu != null ){
               System.out.println("姓名为" + stu.getName() + " , 年龄为" + stu.getAge() + " , 学号为" + stu.getId());
           }
        }
    }

    //创建方法判断学号ID是否重复
    public static boolean contains(Student []arr,int id){
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if( stu != null ){
                int sid = stu.getId();
                if( sid == id ){
                    flag = true;
                }
            }
        }
        return flag;
    }

    //创建方法求数组中存放的元素个数
    public static int getCount(Student []arr){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] != null ){
                count++;
            }
        }
        return count;
    }
    //创建方法创建新的数组 , 并将数组中的元素复制到新数组中
    public static Student[] copyNewArr(Student []arr){
        Student []newArr = new Student[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            newArr[i] = arr[i];
        }
        return newArr;
    }
}
