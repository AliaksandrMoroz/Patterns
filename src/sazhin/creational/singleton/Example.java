package sazhin.creational.singleton;

public class Example{
    public static void main(String[] args) {
        PresidentCar prCar = PresidentCar.getInstance();
        System.out.println(prCar.getArmor());
        prCar.setArmor(250);
        PresidentCar prCar1 = PresidentCar.getInstance();
        System.out.println(prCar1.getArmor());
    }
}
