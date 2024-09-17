package Excercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> words = new ArrayList<>();

        while(true) {
            System.out.print("Enter a word: ");
            String input = scanner.nextLine().trim();
            if(input.isEmpty()) {
                System.out.println("You typed the following words: ");
                for (String word : words) {
                    System.out.println(word);
                }
                break;
            } else {
                words.add(input);
            }
        }
        scanner.close();
    }
}
