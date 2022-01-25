package Sholkov.CreationalDesignPatterns.AbstractFactory;

public class SuvFactory implements CarFactory {
    public Car createCar() {
        return new Raptor();
    }
}
