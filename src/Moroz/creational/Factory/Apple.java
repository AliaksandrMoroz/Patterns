package Moroz.creational.Factory;

public class Apple implements Fruit{
    int cost=3;
    @Override
    public String showCost() {
        return String.valueOf(cost);
    }

    @Override
    public String toString() {
        return "Apple{" +
                "cost=" + cost +
                '}';
    }
}
