package Moroz.creational.Builder;

public class Director {
    PhoneBuilder phoneBuilder;

    public Director(PhoneBuilder phoneBuilder) {
        this.phoneBuilder = phoneBuilder;
    }

    Phone getPhone(){
        phoneBuilder.creatingPhone();

        phoneBuilder.addMaker();
        phoneBuilder.addModel();
        phoneBuilder.addMemory();
        phoneBuilder.addPrice();

        return phoneBuilder.getPhone();
    }
}
