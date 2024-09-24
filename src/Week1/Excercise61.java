package Week1;

import java.util.ArrayList;

public class Excercise61 {
    public static int countItems(ArrayList<String> list) {
        return list.size();
    }

    public static void print(ArrayList<String> printed) {
        for (String word : printed) {
            System.out.println(word);
        }
    }

    public static void removeFirst(ArrayList<String> list) {
        list.remove(0);
    }

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Hallo");
        list.add("Ciao");
        list.add("Hello");

        System.out.println("There are this many items in the list: ");
        System.out.println(countItems(list));
        System.out.println();

        ArrayList<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("Java");
        programmingLanguages.add("C#");
        programmingLanguages.add("Python");
        programmingLanguages.add("C++");
        programmingLanguages.add("C");

        print(programmingLanguages);
        removeFirst(programmingLanguages);
        System.out.println();
        print(programmingLanguages);
    }
}
