package Week1;

import java.util.Random;
import java.util.Scanner;

public class Excercise41 {

    private static int drawNumber() {
        Random random = new Random();
        return random.nextInt(100) + 1; // Generates a number between 1 and 100
    }

    public static void main(String[] args) {
        int targetNumber = drawNumber();
        Scanner scanner = new Scanner(System.in);
        int guess = 0;
        int guessCount = 0;

        while (guess != targetNumber) {
            System.out.print("Guess a number: ");
            guess = scanner.nextInt();
            guessCount++;

            if (guess < targetNumber) {
                System.out.println("The number is greater, guesses made: " + guessCount);
            } else if (guess > targetNumber) {
                System.out.println("The number is lesser, guesses made: " + guessCount);
            } else {
                System.out.println("Congratulations, your guess is correct!");
            }
        }
    }
}
