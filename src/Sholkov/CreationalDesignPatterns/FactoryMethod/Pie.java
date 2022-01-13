package Sholkov.CreationalDesignPatterns.FactoryMethod;

public class Pie implements Cook {
    public void cook() {
        System.out.println("Pie::cook() method.");
    }
}
class Cake implements Cook {
    public void cook() {
        System.out.println("Cake::cook() method.");
    }
}
class Bun implements Cook {
    public void cook() {
        System.out.println("Bun::cook() method.");
    }
}
