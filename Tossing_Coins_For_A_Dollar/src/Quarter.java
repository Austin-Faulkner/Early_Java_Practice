public class Quarter extends Coin {

    Coin q = new Coin();

    final private static double quarter = 0.25;
    private double qEarnings = 0.00;

    public double getQEarnings() {

        if (q.getSideUp() == "heads") {
            qEarnings = quarter;
        } else {
            qEarnings = 0.00;
        }
        return qEarnings;
    }
}
