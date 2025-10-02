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

    }
}
