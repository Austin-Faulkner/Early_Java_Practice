/*
    Gaddis, Chapter 4, Challenge 20: Restaurant Selector

    You have a group of friends coming to visit for your high school reunion,
    and you want to take them out to eat at a local restaurant. Your aren't
    sure if any of them have dietary restrictions, but your restaurant choices
    are as follows:

    Restaurant                  Vegetarian      Vegan       Gluten-Free
    --------------------------------------------------------------------
    Joe's Gourmet Burgers       No              No          No
    Main Street Pizza Company   Yes             No          Yes
    Corner Café                 Yes             Yes         Yes
    Mama's Fine Italian         Yes             No          No
    The Chef's Kitchen          Yes             Yes         Yes

    Write a program that asks whether any members of your part are vegetarian,
    vegan, or gluten-free, then display only the restaurants you may take the
    group. Here is an example.

    Is anyone in your party vegetarian? yes
    Is anyone in your party vegan? no
    Is anyone in your party gluten-free? yes

    Here are our restaurant choices:
        Main Street Pizza Company
        Corner Café
        The Chef's Kitchen
 */

package org.supernovae;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void pollingDietaryRestrictions() {

        System.out.println();
        System.out.println();
        System.out.println("\t\t\t\tPOLLING DIETARY RESTRICTIONS");
        System.out.println("\t\t--------------------------------------------");
    }

    public static String pollForVegetarian() {

        String vegetarian;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\t\tIs anyone in your party vegetarian (y/n)? ");
        vegetarian = keyboard.nextLine();

        return vegetarian;
    }

    public static String pollForVegan() {

        String vegan;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\t\tIs anyone in your party vegan (y/n)? ");
        vegan = keyboard.nextLine();

        return vegan;
    }

    public static String pollForGlutenFree() {

        String glutenFree;

        Scanner keyboard = new Scanner(System.in);

        System.out.print("\t\tIs anyone in your party gluten-free (y/n)? ");
        glutenFree = keyboard.nextLine();

        return glutenFree;
    }

    public static void displayMenu() {

        System.out.println();
        System.out.println();
        System.out.println("\t\tRestaurant\t\t\t\t\t\tVegetarian\t\tVegan " +
                " \t\t\tGluten-Free");
        System.out.println("\t\t-------------------------------------------"
                + "--------------------------------");
        System.out.println("\t\tJoe's Gourmet Burgers\t\t\tNo\t\t\t\tNo" +
                "\t\t\t\tNo");
        System.out.println("\t\tMain Street Pizza Company\t\tYes   \t\t\tNo" +
                "\t\t\t    Yes");
        System.out.println("\t\tCorner Café\t\t\t\t\t\tYes\t\t\t\tYes" +
                "\t\t\t\tYes");
        System.out.println("\t\tMama's Fine Italian\t\t\t    Yes\t\t\t    No" +
                "\t\t\t\tNo");
        System.out.println("\t\tThe Chef's Kitchen\t\t\t\tYes\t\t\t\tYes" +
                "\t\t\t\tYes");
    }

    public static void restaurantOptions(String vgtn, String vegan,
                                         String gf) {
        System.out.println();
        System.out.println("\t\tHere are our restaurant options: ");
        System.out.println();

        ArrayList<String> options = new ArrayList<>();

        options.add("\t\t\t\tJoe's Gourmet Burgers");
        options.add("\t\t\t\tMain Street Pizza Company");
        options.add("\t\t\t\tCorner Café");
        options.add("\t\t\t\tMama's Fine Italian");
        options.add("\t\t\t\tThe Chef's Kitchen");

        // y,y,y
        if (vgtn.equalsIgnoreCase("Y") &&
                vegan.equalsIgnoreCase("Y") &&
                gf.equalsIgnoreCase("Y")) {

            System.out.println("\t\t\t\tCorner Café");
            System.out.println("\t\t\t\tThe Chef's Kitchen");

            // y,n,y
        } else if (vgtn.equalsIgnoreCase("Y") &&
                vegan.equalsIgnoreCase("N") &&
                gf.equalsIgnoreCase("Y")) {

            System.out.println("\t\t\t\tMain Street Pizza");
            System.out.println("\t\t\t\tCorner Café");
            System.out.println("\t\t\t\tThe Chef's Kitchen");

            // y,y,n
        } else if (vgtn.equalsIgnoreCase("Y") &&
                vegan.equalsIgnoreCase("Y") &&
                gf.equalsIgnoreCase("N")) {

            System.out.println("\t\t\t\tCorner Café");
            System.out.println("\t\t\t\tThe Chef's Kitchen");

            // y,n,n
        } else if (vgtn.equalsIgnoreCase("Y") &&
                vegan.equalsIgnoreCase("N") &&
                gf.equalsIgnoreCase("N")) {

            System.out.println("\t\t\t\tMain Street Pizza Company");
            System.out.println("\t\t\t\tCorner Café");
            System.out.println("\t\t\t\tMama's Fine Italian");
            System.out.println("\t\t\t\tThe Chef's Kitchen");
        } else { // n,n,n

            for (String opt : options) {
                System.out.println(opt);
            }
        }
    }

    public static String rePoll() {

        Scanner keyboard = new Scanner(System.in);

        System.out.println();
        System.out.print("\t\tWould you like to re-poll the group" +
                " for any reason (y/n)? ");
        String yesNo = keyboard.nextLine();

        return yesNo;
    }


    public static void main(String[] args) {

        String vgtn, vegan, gf, response;

        displayMenu();

        do {
            pollingDietaryRestrictions();
            vgtn = pollForVegetarian();
            vegan = pollForVegan();
            gf = pollForGlutenFree();
            restaurantOptions(vgtn, vegan, gf);
            response = rePoll();
        } while (response.equalsIgnoreCase("Y"));

    }
}

