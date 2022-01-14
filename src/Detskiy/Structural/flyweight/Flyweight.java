package Detskiy.Structural.flyweight;

import java.util.Random;

public class Flyweight {
    public static void main(String[] args) {

        Random random= new Random();
        Integer dest1;
        Integer dest2;
        String destination;

        for (int i=0;i<50;i++){
            dest1= random.nextInt(300);
            dest2= random.nextInt(300);
            destination= "N "+dest1.toString()+" E "+ dest2.toString();

            System.out.println( Fabric.getTransport(random.nextInt(3)+1,destination ).toString());

        }

    }
}
