package Sholkov.CreationalDesignPatterns.AbstractFactory;

public class Factory {
    public Factory(CarFactory factory) {
        Car car = factory.createCar();
        car.view();
    }
}
