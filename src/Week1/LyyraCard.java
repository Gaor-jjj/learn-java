package Week1;

public class LyyraCard {
    private double balance;

    public LyyraCard(double balanceAtStart) {
        this.balance = balanceAtStart;
    }

    public void payEconomical() {
        if (this.balance >= 2.50) {
            this.balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (this.balance >= 4.00) {
            this.balance -= 4.00;
        }
    }

    public void loadMoney(double amount) {
        if (amount > 0) {
            this.balance += amount;
            double maxBalance = 150.00;
            if (this.balance > maxBalance) {
                this.balance = maxBalance;
            }
        }
    }

    public String toString() {
        return "The card has " + this.balance + " euros";
    }
}
