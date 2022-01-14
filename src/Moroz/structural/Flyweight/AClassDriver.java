package Moroz.structural.Flyweight;

public class AClassDriver extends Driver{
    String name= "Alex";
    @Override
    void drive() {
        System.out.println(name+" drive moto...");
    }
}
