package Excercises;

import java.util.Scanner;

public class Excercise14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num > 0) {
            System.out.println("The number is positive");
        } else {
            System.out.println("The number is negative");
        }
    }
}
