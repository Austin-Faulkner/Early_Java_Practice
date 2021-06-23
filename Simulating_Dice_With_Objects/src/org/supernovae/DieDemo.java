package org.supernovae;

public class DieDemo {

    public static void main(String [] args) {
        final int DODECAHEDRON = 12;
        final int ICOSAHEDRON = 24;

        Die die12 = new Die(DODECAHEDRON);
        Die die24 = new Die(ICOSAHEDRON);

        System.out.println("This game simulates the rolling of " +
                DODECAHEDRON + " and " + ICOSAHEDRON + " die: ");

        System.out.println();
        System.out.println("\t\tSIMULATING ROLL");
        System.out.println("\t\t---------------");

        die12.roll();
        die24.roll();

        System.out.println("\t\t\t " + die12.getValue() + " " + die24.getValue());
    }
}