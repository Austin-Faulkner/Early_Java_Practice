import java.awt.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.URI;

import static java.lang.System.out;

public class WebpageGenerator {

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        String str = br.readLine();
        return str;
    }

    public static void newLine() {
        out.println();
    }

    public static String getName() throws IOException {
        newLine();
        out.print("\t\tEnter your name: ");
        String name = getString();
        return name;
    }

    public static String getPersonalDesc() throws IOException {
        out.print("\t\tDescribe yourself: ");
        String desc = getString();
        return desc;
    }

    public static String fileName() throws IOException {
        String fileName = getString();
        return fileName;
    }

    public static void print() throws IOException {
        PrintWriter outfile = new PrintWriter(fileName());
        outfile.println("<html>");
        outfile.println("<head>");
        outfile.println("</head>");
        outfile.println("<body>");
        outfile.println("<center>" + getName() + "</html>");
        outfile.println("<hr/>" +  getPersonalDesc() + "<hr/>");
        outfile.println("</body>");
        outfile.println("</html>");
        outfile.close();
    }

    public static void main(String [] args) throws IOException {
        newLine();
        newLine();
        out.print("\t\tEnter the webpage's name: ");
        print();
    }
}
