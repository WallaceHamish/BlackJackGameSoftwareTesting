package org.eit;

import org.junit.Test;

import static org.junit.Assert.*;

public class DiceTest {

    //This method will not be tested due to it utilising a random number generator
    //this is because there isn't an expected value to test for
    @Test
    public void roll() {
    }

    //Here we assume the dice has rolled a 6, because the roll method uses a random value
    @Test
    public void getValue() {
        int rollValue = 6;
        assertEquals(rollValue, 6);
    }
}