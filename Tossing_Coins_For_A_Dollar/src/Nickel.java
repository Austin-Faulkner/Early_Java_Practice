public class Nickel extends Coin {

    Coin n = new Coin();

    final private static double nickel = 0.05;
    private double nEarnings = 0.00;

    public double getNEarnings() {

        if (n.getSideUp() == "heads") {
            nEarnings = nickel;
        } else {
            nEarnings = 0.00;
        }
        return nEarnings;
    }
}
