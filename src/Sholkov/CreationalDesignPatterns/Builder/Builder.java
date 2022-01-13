package Sholkov.CreationalDesignPatterns.Builder;

import java.util.logging.Logger;

public class Builder {

        private static final Logger LOGGER = Logger.getLogger(Builder.class.getName());

        public static void main(String[] args) {

            Auto.Builder sportCar = new Auto.Builder(VagGroup.VW, "Corrado").withBody(Body.HATCHBACK)
                    .withPaint(Paint.BLACK).withTuning(Tuning.STAGE3);

            LOGGER.info(sportCar.toString());

            Auto.Builder luxuryCar = new Auto.Builder(VagGroup.PORSCHE, "Panamera").withBody(Body.SEDAN)
                    .withPaint(Paint.WHITE).withTuning(Tuning.STAGE2);

            LOGGER.info(luxuryCar.toString());
        }
    }
