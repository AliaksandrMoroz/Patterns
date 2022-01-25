package Sholkov.Structuraldesignpatterns.Adapter;

public class Adapter {

    public static final Car CAR = new Car();

    public static void main(String[] args) {

        CAR.getCarBody("Car");

        Motorcycle motorcycle = new Motorcycle();
        Tricycle adapter = new Tricycle(motorcycle);
        adapter.getCarBody("Tricycle");
    }

}