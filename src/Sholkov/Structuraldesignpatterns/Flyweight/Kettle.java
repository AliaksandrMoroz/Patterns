package Sholkov.Structuraldesignpatterns.Flyweight;

public class Kettle extends Tableware{
    String material = "steel";

    @Override
    public String toString() {
        return "Kettle{" +
                "material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }
}
