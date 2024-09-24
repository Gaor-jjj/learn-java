package Week1;

public class Excercise5 {
    public static void main(String[] args) {
        int daysInYear = 365;
        int hoursInDay = 24;
        int minutesInHour = 60;
        int secondsInMinute = 60;
        int secondsInYear = daysInYear * hoursInDay * minutesInHour * secondsInMinute;
        System.out.println("There are " + secondsInYear + " seconds in a year.");
    }
}
