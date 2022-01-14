package Moroz.structural.Flyweight;

public class Main {
    public static void main(String[] args) {
        Driver driver1 = DriverFabric.addDriver("a");
        Driver driver2 = DriverFabric.addDriver("a");
        Driver driver3 = DriverFabric.addDriver("a");

        System.out.println(driver1);
        System.out.println(driver2);
        System.out.println(driver3);

        System.out.println(driver1.equals(driver2));
        System.out.println(driver2.equals(driver3));
    }
}
