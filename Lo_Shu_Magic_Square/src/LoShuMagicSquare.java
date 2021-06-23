import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import static java.lang.System.*;

public class LoShuMagicSquare {

    public static void newLine() {
        out.println();
    }

    public static String getString() throws IOException {
        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(isr);
        return br.readLine();
    }


    public static int [][] populateSquare(int [][] square, Scanner kb) {

        out.print("\t\tEnter the elements of the columns for each row (3X3): ");

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                square[row][col] = kb.nextInt();
            }
        }
        return square;
    }

    public static void displaySquare(int [][] square) {

        for (int row = 0; row < square.length; row++) {
            for (int col = 0; col < square[row].length; col++) {
                out.print("\t\t" + square[row][col]);
            }
            newLine();
        }
    }

    public static boolean isLoShuMagic(int [][] square) {

        boolean magic = true;

        int firstRowSum = 0,
            downDiagSum = 0,
            upDiagSum = 0;

        // First row sum
        for (int col = 0; col < square.length; col++) {
            firstRowSum += square[0][col];
        }

        for (int row = 1; row < square.length; row++) {
            int lowerRowSum = 0;
            // Iterate over only the remaining two rows for each column, and
            // for each row reset lowerRowSum
            for (int col = 0; col < square.length; col++) {
                lowerRowSum += square[row][col];
            }
            // Catch if a lowerRowSum is not equal to the first row sum
            if (lowerRowSum != firstRowSum) {
                magic = false;
                break;
            }
        }

        if (magic) {

            for (int col = 0; col < square.length; col++) {
                int colSum = 0;
                // Iterate over only the remaining two cols for each row, and
                // for each col reset rightColSum
                for (int row = 0; row < square.length; row++) {
                    colSum += square[row][col];
                }

                // Catch if a rightColSum is not equal to the firstColSum
                if (colSum != firstRowSum) {
                    magic = false;
                    break;
                }
            }
        }

        // Downward diagonal sum
        if (magic) {

            for (int row = 0; row < square.length; row++) {
                for (int col = 0; col < square.length; col++) {
                    if (row == col)   // Defines the downward diagonal
                        downDiagSum += square[row][col];
                }
            }

            if (downDiagSum != firstRowSum) {
                magic = false;
            }
        }

        // Upward diagonal sum (unique): Rational
        // X |  0 1 2
        // --|--------      ====> if i,j in {a,...,g}, then if (i + j) == 2,
        // 0 |  a b c             it's along the upward diagonal. Thus:
        // 1 |  e f g
        // 2 |  h i g             1: (0,2);  2: (1,1);  3:(2,0)

        if (magic) {

            for (int row = 0; row < square.length; row++) {
                for (int col = 0; col < square.length; col++) {
                   if ((row + col) == 2)
                        upDiagSum += square[row][col];
                }
            }
            if (upDiagSum != firstRowSum) {
                magic = false;
            }
        }
        return magic;
    }

    public static void main(String [] args) throws IOException {

        // EXAMPLES:
        //-------------------------------
        //  Lo Shu: 4 9 2 3 5 7 8 1 6
        //  Not Lo Shu: 1 2 3 4 5 6 7 8 9

        final int ROW = 3;
        final int COL = 3;

        int [][] square = new int[ROW][COL];
        int [][] popSquare = new int[ROW][COL];

        String response;

        newLine();
        newLine();

        do {
            Scanner keyboard = new Scanner(System.in);
            popSquare = populateSquare(square, keyboard);

            newLine();
            out.println("\t\tHere is the square you have entered: ");
            displaySquare(popSquare);

            newLine();
            out.println("\t\tIs Lo Shu Magic? " + isLoShuMagic(popSquare));
            newLine();

            out.print("\t\tWould you like to test another square (y/n)? ");
            response = getString();
            newLine();

        } while (response.equals("Y") || response.equals("y"));
    }
}