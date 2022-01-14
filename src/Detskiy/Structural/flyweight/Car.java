package Detskiy.Structural.flyweight;

import java.util.Random;

public class Car extends Transport{

    String plate;
    Random random = new Random();

    Car(String destination) {
        super(destination);
        Integer num=random.nextInt(1000)+1000;
        this.plate=num.toString();
    }

    @Override
    public String toString() {
        return " We take Car{" +
                " with plate ='" + plate + '\'' +
                ", to " + destination +
                '}';
    }
}
