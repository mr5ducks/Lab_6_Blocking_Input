import java.util.Scanner;
import java.util.Random;

public class HighorLow {
    public static void main(String[] args) {
    //this is were scanner and random start remember to write these
    Scanner in = new Scanner(System.in);
    Random rand = new Random();
        //int variables
        int randomNumber = rand.nextInt(10) + 1; // looks confusing but this is random number between 1 and 10
        int tryGuess = 0; //user

        //
        // 1 to 10 do while loop
    do {
            System.out.print("Guess number between 1-10= ");
    while (!in.hasNextInt()) {
        System.out.println("That's not a number");
        in.next(); // keep this
        System.out.print("Guess a number between 1 and 10= ");
    }
    tryGuess = in.nextInt();//user
    if (tryGuess < 1 || tryGuess > 10) {
        System.out.println("Number has to be 1-10.");
        }
    } while (tryGuess < 1 || tryGuess > 10);

        //the random number gets displayed
        System.out.println("The random number was: " + randomNumber);

        //this gives ba
    if (tryGuess == randomNumber) {
        System.out.println("Correct");
    } else if (tryGuess < randomNumber) {
        System.out.println("low");
    } else {
        System.out.println("high");
    }
        in.close();//closes
    }
}