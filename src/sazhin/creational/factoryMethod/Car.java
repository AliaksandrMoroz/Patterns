package sazhin.creational.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Car {
    String name;
    List<String> accessories = new ArrayList();

    public String toString() {
        return "Model car: " + name + "\n" + accessories;
    }
}
