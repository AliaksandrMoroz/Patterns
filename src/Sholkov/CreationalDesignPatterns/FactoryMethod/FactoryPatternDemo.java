package Sholkov.CreationalDesignPatterns.FactoryMethod;

public class FactoryPatternDemo {
    public static void main(String[] args) {
        CookFactory cookFactory = new CookFactory();
        Cook cook1 = cookFactory.getCook("BUN");
        cook1.cook();
        Cook cook2 = cookFactory.getCook("PIE");
        cook2.cook();
        Cook cook3 = cookFactory.getCook("CAKE");
        cook3.cook();
    }
}
