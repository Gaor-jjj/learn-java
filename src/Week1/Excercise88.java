package Week1;

import java.util.ArrayList;
import java.util.Scanner;

public class Excercise88 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Name: ");
            String name = scanner.nextLine();
            if (name.isEmpty()) {
                break;
            }

            System.out.print("Student number: ");
            String studentNumber = scanner.nextLine();
            if (studentNumber.isEmpty()) {
                break;
            }

            list.add(new Student(name, studentNumber));
        }

        for (Student student : list) {
            System.out.println(student);
        }

        System.out.println("Give search term:");
        String searchTerm = scanner.nextLine();
        for (Student student : list) {
            if (student.getName().toLowerCase().contains(searchTerm.toLowerCase())) {
                System.out.println(student);
            }
        }
    }
}
