package Moroz.creational.Builder;

public class IPhoneSevenBuilder extends PhoneBuilder {
    @Override
    void addMaker() {
        phone.setMaker("IPhone");
    }

    @Override
    void addModel() {
        phone.setModel("7");
    }

    @Override
    void addMemory() {
        phone.setMemory("64gb");
    }

    @Override
    void addPrice() {
        phone.setPrice(350);
    }
}
