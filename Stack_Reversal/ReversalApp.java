import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import static java.lang.System.*;

public class ReversalApp {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static void newLine() {
        out.println();
    }

    public static void main(String [] args) throws IOException {
        newLine();
        newLine();
        out.print("Enter a string: ");
        String s = getString();

        Stack stack = new Stack(s.length());
        PerformReversal pr = new PerformReversal(s);
        newLine();
        out.println("Output: " + pr.doRev());
    }
}
