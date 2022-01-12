package sazhin.creational.factoryMethod;

public class BasicCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new BasicCar();
    }
}
