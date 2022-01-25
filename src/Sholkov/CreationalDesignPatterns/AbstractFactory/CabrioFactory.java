package Sholkov.CreationalDesignPatterns.AbstractFactory;

public class CabrioFactory implements CarFactory {

    public Car createCar() {
        return new Shelby();
    }

}