package hangmanApplication;

import java.io.IOException;
import java.util.Scanner;

public class HangmanApplication {
    public static void main(String[] args) throws IOException {
        //How do we play the game
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to hangman! I will pick a word and you will try to guess it character by character"
                + ". If I guess wrong 6 times, then I win. If you can guess it before then, you win."
                + "Are you ready? I hope so because I am");
        System.out.println();
        System.out.println("I have picked my word. Below is a picture and below "
                + "that is your current guess, which starts off as nothing. Every time you "
                + "guess incorrectly, I add a body part to the picture. When there is a full"
                + " person, you lose");
        // Allows for multiple games
        boolean doYouWantToPlay = true;
        while (doYouWantToPlay) {
            //Setting up the game
            System.out.println("Alright! Let's play!");
            HangMan game = new HangMan();
            do {
                //draw the things
                System.out.println();
                System.out.println(game.drawPicture());
                System.out.println();
                System.out.println(game.getFormalCurrentGuess());
                System.out.println(game.mysteryWord);
            }
            while (!game.gameOver());
            // Playing the game
        }
        //Play again or no?
        System.out.println();
        System.out.println("Do you want to play another game? Enter Y if you do. ");
        Character response = ( sc.next().toUpperCase() ).charAt(0);
        doYouWantToPlay = ( response == 'Y' );
    }
}

