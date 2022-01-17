package sazhin.creational.abstractFactory;

public class Main {
    public static void main(String[] args) {
        HeroFactory hulkFactory = new HulkFactory();
        printHeroInfo(hulkFactory);
        HeroFactory thorFactory = new ThorFactory();
        printHeroInfo(thorFactory);
    }

    public static void printHeroInfo(HeroFactory heroFactory) {
        System.out.println("Name: " + heroFactory.getClass().getSimpleName());
        System.out.println("Weapon: " + heroFactory.getWeapon().getClass().getSimpleName());
        System.out.println("Super power: " + heroFactory.getSuperPower().getClass().getSimpleName());
    }
}
