package Excercises;
import java.util.Scanner;

public class Excercise11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println("Type another number: ");
        int num2 = Integer.parseInt(sc.nextLine());
        System.out.println("The larger of the two numbers given was: " + Math.max(num, num2));
    }
}
