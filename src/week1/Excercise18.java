package week1;

import java.util.Scanner;

public class Excercise18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type the points [0-60]: ");
        int num = Integer.parseInt(sc.nextLine());
        if (num < 30) {
            System.out.println("Grade: failed");
        } else if (num < 35) {
            System.out.println("Grade: 1");
        } else if (num < 40) {
            System.out.println("Grade: 2");
        } else if (num < 45) {
            System.out.println("Grade: 3");
        } else if (num < 50) {
            System.out.println("Grade: 4");
        } else if (num <= 60){
            System.out.println("Grade: 5");
        }
    }
}
