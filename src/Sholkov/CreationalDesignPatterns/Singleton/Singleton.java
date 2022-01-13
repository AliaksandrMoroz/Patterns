package Sholkov.CreationalDesignPatterns.Singleton;

public class Singleton {

        static Singleton Pattern = null;
        private Singleton() {}

        static Singleton getPattern() {
            if (Pattern ==null) {
                Pattern = new Singleton();
            }
            return Pattern;
        }
    }
