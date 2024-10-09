package Week2;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise7 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        Dictionary dict = new Dictionary();

        TextUserInterface ui = new TextUserInterface(reader, dict);
        ui.start();
    }
}
