package week1;

import java.util.Scanner;

public class Excercise50 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type your name: ");
        String name = sc.nextLine();

        if (name.length() >= 3) {
            System.out.println("1. Character: " + name.charAt(0));
            System.out.println("2. Character: " + name.charAt(1));
            System.out.println("3. Character: " + name.charAt(2));
        }
    }
}
