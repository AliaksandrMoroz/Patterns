package sazhin.structural.decorator;

public abstract class Car {
    String name = "Unnamed Car";

    public String getInfo() {
        return name;
    }

    public abstract int getPrice();
}
