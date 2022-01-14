package Sholkov.Structuraldesignpatterns.Flyweight;

public class Duckling extends Tableware{
    String material = "cast iron";

    @Override
    public String toString() {
        return "Duckling{" +
                "material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }
}
