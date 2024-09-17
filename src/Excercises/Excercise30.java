package Excercises;

import java.util.Scanner;

public class Excercise30 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = 1;
        System.out.println("Up to what number?");
        int read = Integer.parseInt(reader.nextLine());
        while (num <= read) {
            System.out.println(num);
            num++;
        }
    }
}
