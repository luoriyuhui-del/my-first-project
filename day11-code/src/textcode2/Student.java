package textcode2;

public class Student {
    //属性 : ID 姓名 年龄 家庭住址
        private String id;
        private String name;
        private int age;
        private String home;
        public Student(){
        }
        public Student(String id, String name, int age, String home){
            this.id = id;
            this.name = name;
            this.age = age;
            this.home = home;
        }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return home;
    }

    public void setHome(String home) {
        this.home = home;
    }
}
