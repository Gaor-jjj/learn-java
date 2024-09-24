package Excercises;

public class Book {
    private String title;
    private String publisher;
    private Integer year;

    public Book(String title, String publisher, Integer year) {
        this.title = title;
        this.publisher = publisher;
        this.year = year;
    }

    public String title() {
        return title;
    }

    public String publisher() {
        return publisher;
    }

    public Integer year() {
        return year;
    }

    @Override
    public String toString() {
        return title + ", " + publisher + ", " + year;
    }
}
