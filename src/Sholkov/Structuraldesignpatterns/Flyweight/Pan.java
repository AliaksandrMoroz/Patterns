package Sholkov.Structuraldesignpatterns.Flyweight;

public class Pan extends Tableware{
    String material = "plastic";

    @Override
    public String toString() {
        return "Pan{" +
                "material='" + material + '\'' +
                '}';
    }

    public String getMaterial() {
        return material;
    }
}
