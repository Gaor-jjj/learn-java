package week1;

import java.util.Scanner;

public class Excercise22 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        while (true) {
            System.out.println("Type the password: ");
            String userInput = reader.nextLine();
            if (userInput.equals(password)) {
                System.out.println("Right!\nThe secret is: jryy qbar!");
                break;
            } else {
                System.out.println("Wrong!");
            }
        }
    }
}
