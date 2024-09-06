package week1;
import java.util.Scanner;

public class Excercise9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type a number: ");
        double num = Integer.parseInt(sc.nextLine());
        System.out.println("Type another number: ");
        double num2 = Integer.parseInt(sc.nextLine());
        System.out.println("Division: " + (num / num2));
    }
}