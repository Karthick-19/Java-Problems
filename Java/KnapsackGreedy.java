package Java;

import java.util.Arrays;

class Item implements Comparable<Item> {
    int weight, value;

    public Item(int weight, int value) {
        this.weight = weight;
        this.value = value;
    }

    @Override
    public int compareTo(Item o) {
        double r1 = (double) value / weight;
        double r2 = (double) o.value / o.weight;
        return Double.compare(r2, r1);
    }
}

public class KnapsackGreedy {
    static double knapsack(int W, Item[] items) {
        Arrays.sort(items);
        double totalValue = 0;
        int remainingCapacity = W;

        for (Item item : items) {
            if (item.weight <= remainingCapacity) {
                totalValue += item.value;
                remainingCapacity -= item.weight;
            } else {
                totalValue += (double) item.value / item.weight * remainingCapacity;
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        int W = 50;
        Item[] items = {new Item(10, 60),
                        new Item(20, 100),
                        new Item(30, 120)};
        double maxValue = knapsack(W, items);
        System.out.println("Maximum value in Knapsack: " + maxValue);
    }
}

