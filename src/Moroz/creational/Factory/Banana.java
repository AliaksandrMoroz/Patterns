package Moroz.creational.Factory;

public class Banana implements Fruit{
    int cost=5;
    @Override
    public String showCost() {
        return String.valueOf(cost);
    }



    @Override
    public String toString() {
        return "Banana{" +
                "cost=" + cost +
                '}';
    }
}
