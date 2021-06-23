import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.out;


public class Tossing_Coins_For_A_Dollar {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void newLine() throws IOException {
        out.println();
    }

    public static void main(String [] args) throws IOException {

        double qBalance = 0.00,
               dBalance = 0.00,
               nBalance = 0.00,
               balance = 0.00;

        newLine();
        newLine();
        out.println("\t\tYou are to toss a nickel, dime, quarter n times.");
        out.print("\t\tEnter n: ");
        int tosses = Integer.parseInt(getString());

        newLine();
        for (int i = 1; i < tosses + 1; i++) {
            Quarter Q = new Quarter();
            out.println("\t\tQuarters " + i + ": " + Q.getQEarnings());
            qBalance += Q.getQEarnings(); ;
        }
        out.printf("\t\tQuarter Balance: %.2f\n", qBalance);

        newLine();
        for (int i = 1; i < tosses + 1; i++) {
            Dime D = new Dime();
            out.println("\t\tDimes " + i + ": " + D.getDEarnings());
            dBalance += D.getDEarnings(); ;
        }
        out.printf("\t\tDime Balance: %.2f\n", dBalance);

        newLine();
        for (int i = 1; i < tosses + 1; i++) {
            Nickel N = new Nickel();
            out.println("\t\tNickels " + i + ": " + N.getNEarnings());
            nBalance += N.getNEarnings(); ;
        }
        out.printf("\t\tNickel Balance: %.2f\n", nBalance);

        balance = qBalance + dBalance + nBalance;

        newLine();
        out.printf("\t\tBalance %.2f\n: ", balance);
        if (balance < 1.00) {
            out.println("\t\tPlay Again!");   // Here's what we need to work on.
        } else if (balance == 1.00) {
            out.println("\t\tYou freakin' won!");
        } else
            out.println("\t\tGame Over!");
    }
}



