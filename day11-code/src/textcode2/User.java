package textcode2;

public class User {
    // 用户类 : -- 属性 : 用户名 密码 身份证号码 手机号码
    private String username;
    private String password;
    private String idcard;
    private String phone;
    // 构造方法
    public User(String username, String password, String idcard, String phone) {
        this.username = username;
        this.password = password;
        this.idcard = idcard;
        this.phone = phone;
    }

    public User() {
    }
    // getter setter 方法

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
