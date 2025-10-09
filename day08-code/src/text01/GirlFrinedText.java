package text01;

public class GirlFrinedText {
    public static void main(String[] args) {
        GirlFrined gf = new GirlFrined();
        gf.setName("枫花恋");
        gf.setAge(18);
        gf.setHeight(1.68);
        System.out.println(gf.getName());
        System.out.println(gf.getAge());
        System.out.println(gf.getHeight());

        gf.number();
        gf.playGame();
        gf.call();

        System.out.println("--------------------------------------");

        GirlFrined gf2 = new GirlFrined();
        gf2.setName("桃乃木香奈");
        gf2.setAge(18);
        gf2.setHeight(1.58);
        System.out.println(gf2.getName());
        System.out.println(gf2.getAge());
        System.out.println(gf2.getHeight());
        gf2.number();
        gf2.playGame();
        gf2.call();
    }
}
