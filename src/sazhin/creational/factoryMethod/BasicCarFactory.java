package sazhin.creational.factoryMethod;

public class BasicCarFactory extends CarFactory {
    public Car createCar() {
        return new BasicCar();
    }

}
