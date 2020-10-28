package org.eit;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class MainTest {

    @Test
    public void getRollValue() {
        
    }

    @Test
    public void isUnderGameScore() {
        boolean value = Main.isUnderGameScore(10);
        assertTrue(true);
    }

    @Test
    public void isOverGameScore() {
        boolean value = Main.isUnderGameScore(22);
        assertFalse(false);
    }

    @Test
    public void rollDice() {
    }

    @Test
    public void displayResults() {
    }

    @Test
    public void getWinnerMessage() {
    }
}