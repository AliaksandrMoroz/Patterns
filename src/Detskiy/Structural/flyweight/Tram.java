package Detskiy.Structural.flyweight;


import java.util.Random;

public class Tram extends Transport {
    String creator;
    Random random = new Random();

    Tram(String destination) {
        super(destination);
        switch (random.nextInt(2)){
            case 0:
                creator="Poland";
                break;
            case 1:
                creator="Belarus";
                break;
            default:
                break;
        }
    }

    @Override
    public String toString() {
        return " We take Tram{" +
                " made by ='" +creator + '\'' +
                ", to " + destination +
                '}';
    }
}
