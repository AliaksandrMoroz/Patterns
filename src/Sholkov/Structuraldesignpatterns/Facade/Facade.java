package Sholkov.Structuraldesignpatterns.Facade;

public class Facade{
    public static void main(String[] args) {
        BodyMade bodyMade = new BodyMade();

        bodyMade.madeCoupe();
        bodyMade.madeLimusin();
        bodyMade.madeCabrio();
    }
}