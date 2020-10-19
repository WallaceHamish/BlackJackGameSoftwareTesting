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
            System.out.println("Computer Score: " + computerScore);
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

    //** This method will ask the user if they want roll the dice (REQUIREMENT-4)
    public static boolean rollDice() {
        Scanner keyboard = new Scanner(System.in); //** Checks for keyboard input
        System.out.print("Roll the dice? (Y/N): ");
        String userResponse = keyboard.nextLine(); //** Retrieves a line of input
        char letter = userResponse.charAt(0); //** Retrieves the first character letter for input
        if (letter == 'Y' || letter == 'y') {
            return true;
        } else {
            return false;
        }
    }


    //** This method handles the displaying of the score results.
    public static void displayResults(int computerScore, int userScore) {
        System.out.println("\nGame Over\n");
        System.out.println("User's Score: " + userScore);
        System.out.println("Computer's Score: " + computerScore);
        System.out.println(getWinnerMessage(computerScore, userScore)); //** Data to display user & computer score in winner message
    }

    //** This method will return a message on who is the game winner
    public static String getWinnerMessage(int computerScore, int userScore) {
        //** If else statement used to display scores
        if (userScore > computerScore && isUnderGameScore(userScore)) {
            return "Well done! You have won the game!";
        } else if (isUnderGameScore(userScore)
                && !isUnderGameScore(computerScore)) {
            return "Well done! You have won the game!";
        } else if (userScore == 21 && computerScore != 21) {
            return "Well done! You have won the game!";
        } else if (userScore == computerScore) {
            return "The game has tied!";
        } else if (!isUnderGameScore(userScore)
                && !isUnderGameScore(computerScore)) {
            return "The game ended without a declared winner!";
        } else {
            return "The computer has won the game";
        }
    }
}
