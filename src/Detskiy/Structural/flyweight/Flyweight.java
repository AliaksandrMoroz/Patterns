package Detskiy.Structural.flyweight;

import java.util.Random;

public class Flyweight {
    public static void main(String[] args) {

        Random random= new Random();

        for (int i=0;i<50;i++){
            System.out.println( Fabric.getTransport(random.nextInt(3)+1,"somwhere" ).toString());

        }

    }
}
