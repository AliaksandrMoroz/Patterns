package Moroz.creational.Builder;

public class SamsungGalaxyBuilder extends PhoneBuilder {
    @Override
    void addMaker() {
        phone.setMaker("Samsung");
    }

    @Override
    void addModel() {
        phone.setModel("Galaxy");
    }

    @Override
    void addMemory() {
        phone.setMemory("128gb");
    }

    @Override
    void addPrice() {
        phone.setPrice(300);
    }
}
