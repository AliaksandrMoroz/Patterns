package sazhin.creational.singleton;

public class PresidentCar {
    private static PresidentCar presidentCar = new PresidentCar();
    private int armor;

    private PresidentCar() {
        this.armor = 120;
    }

    public static PresidentCar getInstance() {
        return presidentCar;
    }

    public int getArmor() {
        return armor;
    }

    public void setArmor(int armor) {
        this.armor = armor;
    }
}
