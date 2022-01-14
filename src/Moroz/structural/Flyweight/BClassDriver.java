package Moroz.structural.Flyweight;

public class BClassDriver extends Driver{
    String name ="Vasya";
    @Override
    void drive() {
        System.out.println(name+" drive car...");
    }
}
