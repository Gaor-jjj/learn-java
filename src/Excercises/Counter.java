package Excercises;

public class Counter {
    private int count;
    private boolean check;

    public Counter(int startingValue, boolean check) {
        this.check = check;
        if (check && startingValue < 0) {
            this.count = 0;
        } else {
            this.count = startingValue;
        }
    }

    public Counter(int startingValue) {
        this.count = startingValue;
        this.check = false;
    }

    public Counter(boolean check) {
        this.check = check;
        this.count = 0;
    }

    public Counter() {
        this.count = 0;
        this.check = false;
    }

    public int value() {
        return this.count;
    }

    public void increase() {
        this.count++;
    }

    public void decrease() {
        if (check && count > 0) {
            this.count--;
        } else if (!check) {
            this.count--;
        }
    }
}
