package Moroz.creational.Protype;

public class Main {
    public static void main(String[] args) {

        MyObject firstMyObject = new MyObject("firstName", 1000, true);

        MyObject secondMyObject = (MyObject) firstMyObject.copy();

        System.out.println("First: "+firstMyObject + "\n" + "Second: "+secondMyObject);
    }


}
