package org.eit;

public class Main {

    public static void main(String[] args) {

        //** Initial starting score of both the player and computer
        int computerScore = 0;
        int userScore = 0;

        while (playAgain()) {
            computerScore += getRollValue();
            userScore += getRollValue();
            //** Break statement implemented inside loop if either the player or computer goes over the score limit
            if (!isUnderGameLimit(userScore)
                    || !isUnderGameLimit(computerScore)) {
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
}
