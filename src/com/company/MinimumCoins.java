package com.company;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: Brant
 * Date: 11/5/13
 * Time: 10:26 PM
 * To change this template use File | Settings | File Templates.
 */
//Class Definition
public class MinimumCoins {
    // Initializing class variables
    private int userInput;
    private int quarters = 0;
    private int dimes = 0;
    private int nickel = 0;
    private boolean quit = false;

    //constructor - builds this class
    public MinimumCoins() {
        System.out.println("Please enter amount of change. (1-99)");
        Scanner scanner = new Scanner(System.in);
        userInput = Integer.parseInt(scanner.nextLine());
        if (userInput == 0) {

            quit = true;
        }

        quarters = setChange(25);
        dimes = setChange(10);
        nickel = setChange(5);


    }

    public static void main(String[] args) {
        while (true) {
            MinimumCoins coins = new MinimumCoins();

            if (coins.shouldQuit()) {
                break;
            }
            coins.output();
        }


    }

    /**
     * This is going to return true if user enters "0"
     *
     * @return boolean
     */
    public boolean shouldQuit() {
        return quit;
    }

    /**
     * Print out results to screen.
     */
    public void output() {
        System.out.println("Quarters: " + quarters + "\nDimes: " + dimes + "\nNickels: " + nickel + "\nPennies: "
                + userInput);
    }

    /**
     * Takes the number we want to count within the users input. then returns how many times it found that number.
     *
     * @param value the number to count
     * @return how many times it was found.
     */
    private int setChange(int value) {
        int changeType = 0;

        while (userInput >= value) {
            userInput -= value;
            changeType++;


        }

        return changeType;
    }

    public int getUserInput() {
        return userInput;
    }
}

