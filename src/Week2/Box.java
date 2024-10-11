package Week2;

import java.util.ArrayList;

public class Box implements ToBeStored {
    private double maxWeight;
    private ArrayList<ToBeStored> items;

    public Box(double maxWeight) {
        this.maxWeight = maxWeight;
        this.items = new ArrayList<>();
    }

    public boolean add(ToBeStored item) {
        double currentWeight = this.weight();
        if (currentWeight + item.weight() <= maxWeight) {
            items.add(item);
            return true;
        }
        return false;
    }

    @Override
    public double weight() {
        double totalWeight = 0;
        for (ToBeStored item : items) {
            totalWeight += item.weight();
        }
        return totalWeight;
    }

    @Override
    public String toString() {
        return "Box: " + items.size() + " things, total weight " + weight() + " kg";
    }
}
