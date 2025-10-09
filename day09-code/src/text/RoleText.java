package text;

public class RoleText {
    public static void main(String[] args) {
        //创建第一个角色对象
        Role r1 = new Role("葱", 100);
        //创建第二个角色对象
        Role r2 = new Role("兔子",100);
        //循环进行攻击 , 直到一方的血量归零 break 退出循环
        while( true ){
            r1.attack(r2);
            if( r2.getBlood() == 0 ){
                System.out.println(r1.getName() + "杀死了" + r2.getName());
                break;
            }
            r2.attack(r1);
            if( r1.getBlood() == 0 ){
                System.out.println(r2.getName() + "杀死了" + r1.getName());
                break;
            }
        }
    }
}
