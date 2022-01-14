package Moroz.creational.Factory;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello Factory Pattern");
        List<Person> peoples = new ArrayList<>();
        peoples.add(new Person("Alex",(int)(Math.random()*7)));
        peoples.add(new Person("Vitya",(int)(Math.random()*7)));
        peoples.add(new Person("Vasya",(int)(Math.random()*7)));
        peoples.add(new Person("Yarik",(int)(Math.random()*7)));
        peoples.add(new Person("Kolya",(int)(Math.random()*7)));

        for (Person person:
             peoples) {
            Factory factory = new Factory(person);
            System.out.println(person.name+" buy "+factory.addFruit());
            System.out.println("_________");
        }
    }
}
