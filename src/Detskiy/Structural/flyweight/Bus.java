package Detskiy.Structural.flyweight;

import java.util.Random;

public class Bus extends Transport {
    String driver;
    Random random = new Random();

    Bus(String destination) {
        super(destination);
        switch (random.nextInt(2)){
            case 0:
                driver="Petrovich";
                break;
            case 1:
                driver="Vasilich";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return " We take Bus{" +
                " with Driver ='" +driver + '\'' +
                ", to " + destination +
                '}';
    }
}
