package Sholkov.Structuraldesignpatterns.Adapter;

    public class Tricycle extends Car {

        private Motorcycle motorcycle;
        public Tricycle(Motorcycle motorcycle){
            this.motorcycle = motorcycle;
        }

        public void getBody(String body){
            motorcycle.getMotorcycleBody(body);
        }
    }
