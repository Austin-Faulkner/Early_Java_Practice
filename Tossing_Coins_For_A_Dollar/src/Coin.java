import java.util.Random;

public class Coin {

    private static String sideUp;

    Coin() {
        toss();
    }

    public static void toss() {
        Random side = new Random();
        int face = side.nextInt(2);

        if (face == 0) {
            sideUp = "heads";
        }
        else {
            sideUp = "tails";
        }
    }

    public static String getSideUp() {
        return sideUp;
    }
}

