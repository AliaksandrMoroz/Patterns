package sazhin.creational.factoryMethod;

public class LuxCarFactory extends CarFactory{
    @Override
    public Car createCar() {
        return new LuxCar();
    }
}
