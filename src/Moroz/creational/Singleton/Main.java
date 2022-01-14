package Moroz.creational.Singleton;

public class Main {
    public static void main(String[] args) {
        Sing firstSing = Sing.getSing();
        for (int i = 0; i < 200; i++) {
            firstSing= Sing.getSing();
        }
        System.out.println(Sing.count);
    }
}
