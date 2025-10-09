package text06;

public class GirlFriend {
    private String name;//姓名
    private int age;//年龄
    private char gender;//性别
    private String hobby;//爱好

    public GirlFriend() {
    }
    public GirlFriend(String name, int age, char gender, String hobby){
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.hobby = hobby;
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

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
    public void show(){
        System.out.println("姓名：" + name + "  年龄：" + age + "  性别：" + gender + "  爱好：" + hobby);
    }
}
