import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.System.*;

public class BalancedDelimiterCheckerApp {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String s = br.readLine();
        return s;
    }

    public static void newLine() {
        out.println();
    }

    public static void main(String [] args) throws IOException {
        boolean status = false;
        boolean yesNo;

        do {
            newLine();
            out.print("\t\tEnter a string with delimiters: ");
            out.flush();

            String input = getString();

            if (input.equals(""))        // if type nothing by <return>, end
                return;

            BalanceChecker bc = new BalanceChecker(input);
            status = bc.check();
            out.println("\t\tBalanced: " + status);

            newLine();

            out.print("\t\tGo again (yes: true/no: false)? ");
            String response = getString();
            yesNo = Boolean.parseBoolean(response);

        } while (yesNo);
    }
}
