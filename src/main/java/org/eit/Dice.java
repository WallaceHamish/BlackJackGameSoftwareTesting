package org.eit;

import java.util.Random;

public class Dice {

    //** Variables **\\

    private final int NumberOfSides = 6;
    private int value;

    //** Constructor is used to call a roll method is used to set value of the dice

    Dice() {
        roll();
    }

    //** Roll method sets the value of the dice to a random number (REQUIREMENT-2)

    public void roll() {
        Random randomValue = new Random();
        value = randomValue.nextInt(NumberOfSides) + 1;
    }

    //** This method will retrieve the roll value and return the number that represents the roll

    public int getValue() {
        return value;
    }

}


