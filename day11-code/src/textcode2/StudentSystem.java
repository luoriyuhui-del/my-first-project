package textcode2;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentSystem {
    public static void startStudentSystem() {
        System.out.println("-------------- 欢迎来到学生管理系统 -------------");
        //编写一个学生管理系统
        Scanner sc = new Scanner(System.in);

        //创建一个学生对象集合
        //1.首先要有主页面
        //2.
        ArrayList<Student> list = new ArrayList<>();
        boolean flag = true;

        //第一种跳出循环 : loop : 指定循环
        //扩展 loop : while( true ){
        //              switch( choice ){
        //               case 1 : break loop ; --- 指定结束loop的循环 ( 结束while的循环而不是switch的)
        //              }
        //         }
        // ---- 第二种跳出循环 : System.exit(0); 停止虚拟机运行

        while( flag ){
            int choice = getChoice(sc);
            boolean flag2 = (list.size() == 0);
            switch (choice) {
                case 1:
                    System.out.println("添加第" + ( list.size() + 1 ) + "位学生的信息");
                    addStudent(list);
                    printGet();
                    break;
                case 2:
                    if( flag2 ){
                        System.out.println("在当前管理系统中没有学生信息 , 请添加后再删除");
                    }else{
                        System.out.println("请输入你要删除的学生id");
                        String id = sc.next();
                        deleteStudent(list , id);
                        System.out.println("当前系统存在" + list.size() + "位学生信息");
                    }
                    printGet();
                    break;
                case 3:
                    if( flag2 ){
                        System.out.println("在当前管理系统中没有学生信息 , 请添加后再修改");
                    }else{
                        System.out.println("请输入你要修改的学生id");
                        String id = sc.next();
                        updateStudent(list , id);
                    }
                    printGet();
                    break;
                case 4:
                    if( flag2 ){
                        System.out.println("在当前管理系统中没有学生信息 , 请添加后再查询");
                    }else{
                        queryStudent(list);
                    }
                    printGet();
                    break;
                case 5:
                    System.out.println("退出系统");
                    flag = false;
                    break;
                default:
                    System.out.println("请输入正确的选项");
                    printGet();
            }
        }
    }

    //创建主界面
    private static int getChoice(Scanner sc) {
        System.out.println("1. 添加学生");
        System.out.println("2. 删除学生");
        System.out.println("3. 修改学生");
        System.out.println("4. 查询学生");
        System.out.println("5. 退出系统");
        System.out.println("请输入你的选择:");
        //判断用户输入时如果不是数字类型报错的情况下提示错误 , 优化代码
        try {
            return sc.nextInt();
        } catch (Exception e) {
            sc.nextLine(); // 清除无效输入
            return -1; // 返回无效选项，让主程序处理错误提示
        }
    }

    //创建后续每一次操作的隔离
    public static void printGet() {
        System.out.println("---------------------------------------");
    }

    //添加学生信息 ------------------- 添加学生信息集合 --------------------------
    public static void addStudent( ArrayList< Student>  list ){
        Scanner sc = new Scanner(System.in);
        Student s = new Student();
        // ---------------- 在这里输入数据时不能连续使用 sc.nextLine() , 因为 sc.nextLine() 会把回车符也读入 ----------
        while (true) {
            System.out.println("请输入学生ID:");
            String id = sc.next();
            if( contains(list , id) ){
                System.out.println("该ID已存在 , 请重新输入");
            }else{
                s.setId(id);
                break;
            }
        }


        System.out.println("请输入学生姓名:");
        String name = sc.next();
        s.setName(name);

        System.out.println("请输入学生年龄:");
        int age = sc.nextInt();
        s.setAge(age);

        System.out.println("请输入学生家庭住址:");
        String home = sc.next();
        s.setHome(home);
        System.out.println("添加学生信息成功");

        list.add( s );
    }

    //创建方法 ----------------------- 删除学生信息 ------------------------------
    public static void deleteStudent(ArrayList< Student> list , String id){
        if( !contains(list , id) ){
            System.out.println("没有该ID , 删除失败");
        }else{
            for (int i = 0; i < list.size(); i++) {
                String numId = list.get(i).getId();
                if( numId.equals(id) ){
                    list.remove(i);
                    System.out.println("删除成功");
                    break;
                }
            }
        }
    }

    //创建方法 ------------------------- 修改学生信息 ------------------------------
    public static void updateStudent(ArrayList< Student> list , String id){
        if( !contains(list , id)){
            System.out.println("没有该ID , 修改失败");
        }
        for (int i = 0; i < list.size(); i++) {
            Scanner sc = new Scanner(System.in);
            Student s = list.get(i);
            if( s.getId().equals(id) ){

                System.out.println("请输入学生姓名:");
                String newName = sc.next();
                s.setName(newName);

                System.out.println("请输入学生年龄:");
                int newAge = sc.nextInt();
                s.setAge(newAge);

                System.out.println("请输入学生家庭住址:");
                String newHome = sc.next();
                s.setHome(newHome);

                list.set(i , s);
                System.out.println("第" + ( i + 1 ) + "学生的信息修改成功");
            }
        }
    }

    //创建方法 ------------------------- 查询学生信息 ------------------------------
    public static void queryStudent(ArrayList< Student> list ){
        System.out.println("id\t\t姓名\t年龄\t家庭住址");//\t制表符 , 补齐8位字节
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            System.out.println(s.getId() + "\t" + s.getName() + "\t" + s.getAge() + "\t" + s.getHome());
        }
    }

    //创建方法判断在输入 ------------ 学生信息时id是否存在 -------------------
    public static boolean contains(ArrayList< Student> list , String id){
        boolean flag = false;
        for (int i = 0; i < list.size(); i++) {
            Student s = list.get(i);
            if( s.getId().equals(id) ){
                flag = true;
                break;
            }
        }
        return flag;
    }
}
