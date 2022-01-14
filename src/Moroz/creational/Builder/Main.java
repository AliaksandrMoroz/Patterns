package Moroz.creational.Builder;

public class Main {
    public static void main(String[] args) {
        Phone phone = new Director(new SamsungGalaxyBuilder()).getPhone();
        System.out.println(phone);
    }

}
