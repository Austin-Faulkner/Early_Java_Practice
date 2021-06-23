public class Dime extends Coin {

    Coin d = new Coin();

    final private static double dime = 0.10;
    private double dEarnings = 0.00;

    public double getDEarnings() {

        if (d.getSideUp() == "heads") {
            dEarnings = dime;
        } else {
            dEarnings = 0.00;
        }
        return dEarnings;
    }


}
