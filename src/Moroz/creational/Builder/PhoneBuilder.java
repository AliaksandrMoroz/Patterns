package Moroz.creational.Builder;

public abstract class PhoneBuilder {
    Phone phone;

    void creatingPhone() {
        phone = new Phone();
    }

    abstract void addMaker();

    abstract void addModel();

    abstract void addMemory();

    abstract void addPrice();

    Phone getPhone() {
        return this.phone;
    }
}
