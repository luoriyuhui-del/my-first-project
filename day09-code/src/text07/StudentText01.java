package text07;

import java.util.Scanner;

public class StudentText01 {
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

        //判断id是否存在 , 存在即删除
        //创建方法 , 判断并找到存在id的数组索引
        int count = contains(arr,4);
        if( count >= 0 ){
            //说明id存在 , 需要删除
            //将对应的数组索引置置为NULL
            arr[count] = null;
            extracted(arr);
        }else{
            //id不存在
            System.out.println("id不存在");
        }
    }

    public static int contains(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //判断数组中是否有元素 , 空NULL不能参与表达式运算
            if( stu != null ){
                int sid = stu.getId();
                if( sid == id ){
                    return i;
                }
            }
        }
        return -1;
    }

    //创建方法输出数组中的元素
    private static void extracted(Student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            //当数组未满输出的是原数组中的元素arr
            //当数组已满输出的是新数组中的元素NewArr

            //判断数组中是否有元素 , 空NULL不能参与表达式运算
            if (stu != null) {
                System.out.println("姓名为" + stu.getName() + " , 年龄为" + stu.getAge() + " , 学号为" + stu.getId());
            }
        }
    }
}