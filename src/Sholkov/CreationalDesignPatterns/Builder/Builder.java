package Sholkov.CreationalDesignPatterns.Builder;

public class Builder {

        public static void main(String[] args) {

            Auto.Builder sportCar = new Auto.Builder(VagGroup.VW, "Corrado").withBody(Body.HATCHBACK)
                    .withPaint(Paint.BLACK).withTuning(Tuning.STAGE3);

            System.out.println(sportCar.toString());

            Auto.Builder luxuryCar = new Auto.Builder(VagGroup.PORSCHE, "Panamera").withBody(Body.SEDAN)
                    .withPaint(Paint.WHITE).withTuning(Tuning.STAGE2);

            System.out.println(luxuryCar.toString());
        }
    }
