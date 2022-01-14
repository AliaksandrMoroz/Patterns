package Sholkov.Structuraldesignpatterns.Flyweight;

import java.util.ArrayList;
import java.util.List;

public class Flyweight {

    public static void main(String[] args) {

        List <Tableware> test = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            test.add(Fabrica.getWare(4));
        }
        System.out.println(test);
        //System.out.println(test.get(1).equals(test.get(2)));
    }
}
