package sazhin.creational.factoryMethod;

public class LuxCarFactory extends CarFactory {
    public Car createCar() {
        return new LuxCar();
    }

}
