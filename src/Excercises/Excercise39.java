package Excercises;

public class Excercise39 {
    private static void printStars(int amount) {
        int i = 0;
        while (i < amount) {
            System.out.print("*");
            i++;
        }
        System.out.println();
    }

    private static void printSquare(int sides) {
        int i = 0;
        while (i < sides) {
            printStars(sides);
            i++;
        }
    }

    private static void printRectangle(int width, int height) {
        int i = 0;
        while (i < height) {
            printStars(width);
            i++;
        }
    }

    private static void printTriangle(int size) {
        int i = 0;
        while (i < size) {
            i++;
            printStars(i);
        }
    }

    public static void main(String[] args) {
        printSquare(5);
        printRectangle(17, 3);
        printTriangle(4);
    }
}
