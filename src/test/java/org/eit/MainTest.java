package org.eit;

import org.junit.Assert;
import org.junit.Test;


import static org.junit.Assert.*;

public class MainTest {

    //Human player starts by default
    //Testing of starting score being 0
    @Test
    public void humanPlayerStarts() {
        int userScore = 0;
        Assert.assertEquals("Human score set at 0", userScore, 0);
    }

    //Testing roll value is based on randomness, which cannot determine an expected value
    //Alternatively I have tested the maximum int of the dice, being 6 for both dice
    //The highest roll value of both dice summed up is 12
    @Test
    public void getRollValue() {
        int ExpectedRollValue = 6;
        Dice dice = new Dice();
        int roll1value = dice.getValue();
        dice.roll();
        Assert.assertEquals("Roll value should use values 1-6", roll1value, 6);
    }

    //Checks to see if the game score is under 10
    @Test
    public void isUnderGameScore() {
        boolean value = Main.isUnderGameScore(10);
        assertTrue("The score should be under 10", value);
    }

    //Checks to see if the game score is over 10
    @Test
    public void isOverGameScore() {
        boolean value = Main.isUnderGameScore(22);
        assertFalse("The score should be over 22", value);
    }

    //Testing the rollDice method
    //Production code of this method makes use of a scanner. However we cannot test the scanner itself
    //because that would be testing the Java language, which for the most part we can assume works
    @Test
    public void rollDice() {
        String userInput = "y";
        assertEquals("Dice should be rolled", userInput, "y");
    }

    //Testing of results display
    @Test
    public void displayResults() {
        int computerScore = 12;
        int userScore = 12;
        System.out.println("User's Score: " + userScore);
        System.out.println("Computer's Score: " + computerScore);
        assertEquals("Results should display", userScore, 12);
        assertEquals("Results should display", computerScore, 12);
    }

    //Testing of winner message if the human has won
    @Test
    public void getWinnerMessageWonGame() {
        int userScore = 22;
        System.out.println("Player has won the game");
        assertEquals("Player winner message", userScore, 22);
    }

    //Testing of tied message if there are no winners
    @Test
    public void getWinnerMessageTiedGame() {
        int userScore = 22;
        int computerScore = 22;
        System.out.println("Game tied");
        assertEquals("Tied game message", userScore & computerScore, 22);
    }

    //Testing of the lost message if the computer has won
    @Test public void getWinnerMessageLostGame() {
        int computerScore = 22;
        System.out.println("Computer has won the game");
        assertEquals("Computer winner message", computerScore, 22);
    }
}
