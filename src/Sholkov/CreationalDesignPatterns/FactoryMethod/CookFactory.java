package Sholkov.CreationalDesignPatterns.FactoryMethod;

public class CookFactory {
    public Cook getCook(String cookType) {
        if(cookType == null) {
            return null;
        }
        if(cookType.equalsIgnoreCase("BUN")) {
            return new Bun();
        }
        else if(cookType.equalsIgnoreCase("PIE")) {
            return new Pie();
        }
        else if(cookType.equalsIgnoreCase("CAKE")) {
            return new Cake();
        }
        return null;
    }
}

