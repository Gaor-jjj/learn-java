package week1;

import java.util.Scanner;

public class Excercise19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("How old are you: ");
        int age = Integer.parseInt(sc.nextLine());
        if (age >= 0 && age <= 120) {
            System.out.println("OK");
        } else {
            System.out.println("Impossible");
        }
    }
}
