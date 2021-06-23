package org.supernovae;

import java.util.Random;

public class Die {

    private int sides;
    private int value;

    // Constructor with args allows us to skip on the setters.
    public Die(int numSides) {
        sides = numSides;
        roll();   // sets value
    }

    public int getValue() {
        return value;
    }

    public void roll() {

        Random rand = new Random();

        value = rand.nextInt(sides) + 1; // Here, sides specifies a random #
                                         // up to but not including the sides
                                         // integer value.
    }
}
