package Week1;



public class Excercise75 {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(100);
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.decrease();
        counter.printValue();

        counter.reset();
        counter.printValue();

        counter.setInitial();
        counter.printValue();
    }
}
