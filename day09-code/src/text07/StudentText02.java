package text07;

public class StudentText02 {
    public static void main(String[] args) {
        //创建数组存取Student对象
        Student []arr = new Student[3];

        //创建对象并存入数组中
        Student s1 = new Student("小林",22,1);
        Student s2 = new Student("小钟",23,2);
        Student s3 = new Student("小聪",22,3);
        arr[0] = s1;
        arr[1] = s2;
        arr[2] = s3;

        //判断学号是否存在
        int count = contains(arr,2);
        if( count >= 0 ){
            int age = arr[count].getAge() + 1 ;
            arr[ count ].setAge( age );
            extracted(arr);
        }else{
            System.out.println("当前输入学号不存在");
        }
    }
    //创建方法 , 判断学号是否存在 , 若存在则返回所在数组中的索引
    public static int contains(Student []arr,int id){
        for (int i = 0; i < arr.length; i++) {
            Student stu = arr[i];
            if( stu != null ){
                int sid = stu.getId();
                if( sid == id ){
                    return i;
                }
            }
        }
        return -1;
    }

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
