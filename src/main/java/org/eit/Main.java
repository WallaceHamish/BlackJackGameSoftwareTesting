package org.eit;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //** Initial starting score of both the player and computer
        // The human player will start first (REQUIREMENT-1)
        int computerScore = 0;
        int userScore = 0;

        while (rollDice()) {
            computerScore += getRollValue();
            userScore += getRollValue();
            //** Break statement implemented inside loop if either the player or computer goes over the score limit
            if (!isUnderGameScore(userScore)
                    || !isUnderGameScore(computerScore)) {
                break;
            }
            System.out.println("User Score: " + userScore);
        }

        if (userScore == 0 && computerScore == 0) {
            System.out.println("Play against the computer to see your score");
        } else {
            displayResults(computerScore, userScore);
        }

    }

    //** This method returns value that represents the sum of both the dice (REQUIREMENT-3)
    public static int getRollValue() {

        Dice dice = new Dice();
        //** Rolling of the first dice
        int roll1Value = dice.getValue();
        //** Rolling of the second dice
        dice.roll();
        int roll2Value = dice.getValue();
        //** Returns the sum of the value from the dice
        return roll1Value + roll2Value;
    }

    //** This method determines if the score limit of 21 has been reached (REQUIREMENT-7)
    public static boolean isUnderGameScore(int value) {
        if (value > 21) {
            return false;
        } else {
            return true;
        }
    }

    //** This method will ask the user if they want roll the dice or hold it instead,
    // allowing the computer to roll (REQUIREMENT-4)
    public static boolean rollDice() {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Would you like to roll the dice? (Y/N) : ");
        String userResponse = keyboard.nextLine(); //** Retrieves a line of input
        char letter = userResponse.charAt(0); //** Retrieves the first character letter for input
        if (letter == 'Y' || letter == 'y') {
            return true;
        } else {
            return false;
        }
    }
}
