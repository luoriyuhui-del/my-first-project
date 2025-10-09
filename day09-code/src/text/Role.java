package text;

import java.util.Random;

public class Role {
    private String name;//角色名称
    private int blood;//生命值

    public Role() {
    }
    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(Role role){
        //攻击方法：首先在调用者的方法里获取被攻击者的参数（Role role：它包括名称 血量 以及方法 --
        // 这里只使用到了成员变量（名称和血量）），然后对其血量进行了修改
        //创建随机变量表示伤害值 ， 在用血量减去伤害值，然后判断是否 血量 > 0
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;//hurt表示伤害值 （1~20）
        int remainBlood = role.getBlood() - hurt;
        //判断剩余血量 , 如果 > 0 ，则设置剩余血量，否则设置为0 并将值返回给调用参数
        remainBlood = remainBlood > 0 ? remainBlood : 0;
        role.setBlood(remainBlood);
        System.out.println(this.name + "攻击了" + role.getName() + "造成了" + hurt + "伤害值"
        + "，" + role.getName() + "剩余血量是" + remainBlood);
    }
}
