package text01;

import java.util.Random;

public class Role {
    private String name;//角色名称
    private int blood;//生命值
    private char gender;
    private String face;


    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平"};
    //attack 攻击描述：
    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };

    //injured 受伤描述：
    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public Role() {
    }
    public Role(String name, int blood , char gender ) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r = new Random();
        if( gender == '男' ){
            this.face = boyfaces[r.nextInt(boyfaces.length)];
        }else if( gender == '女'){
            this.face = girlfaces[r.nextInt(girlfaces.length)];
        }else{
            this.face = "面目狰狞";
        }
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

        //-----------------攻击描述-------------------------------
        int index = r.nextInt(attacks_desc.length);//定义随机值从招式字符数组中抽取
        String KungFu = attacks_desc[index];
        //谁this.getName  使用了什么招式(KungFu) 攻击了谁role.getName
        System.out.printf(KungFu,this.getName(), role.getName());
        //souf是printf的扩展版 , 用%s表示字符串 , 在逗号后面添加字符串代替%s------------------------------
        System.out.println();//换行

        //-----------------血量描述-------------------------------
        int hurt = r.nextInt(20) + 1;//hurt表示伤害值 （1~20）
        int remainBlood = role.getBlood() - hurt;
        //判断剩余血量 , 如果 > 0 ，则设置剩余血量，否则设置为0 并将值返回给调用参数
        remainBlood = remainBlood > 0 ? remainBlood : 0;
        role.setBlood(remainBlood);

        //-------------------受伤描述-------------------------------
        //用百分比来显示血量状态 , 从而选择不同的描述
        if( remainBlood > 90 ){
            System.out.printf(injureds_desc[0],role.getName());
        }else if( remainBlood > 80 ){
            System.out.printf(injureds_desc[1],role.getName());
        }else if( remainBlood > 70 ){
            System.out.printf(injureds_desc[2],role.getName());
        }else if( remainBlood > 60){
            System.out.printf(injureds_desc[3],role.getName());
        }else if(remainBlood > 40){
            System.out.printf(injureds_desc[4],role.getName());
        }else if(remainBlood > 20){
            System.out.printf(injureds_desc[5],role.getName());
        }else if( remainBlood > 10){
            System.out.printf(injureds_desc[6],role.getName());
        }else{
            System.out.printf(injureds_desc[7],role.getName());
        }
        System.out.println();//换行
    }
    public void show(){
        System.out.println("角色名称：" + getName() + "，性别：" + getGender() + "，长相为：" + getFace() + "，剩余血量：" + getBlood());
    }
}
