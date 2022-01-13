package sazhin.creational.builder;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person.PersonBuilder("John", "Alley").age(25).phone("123001").address("CHD").build();
        System.out.println(person1);

        Person person2 = new Person.PersonBuilder("Amy", "Reacher").age(40).phone("5655").build();
        System.out.println(person2);

        Person person3 = new Person.PersonBuilder("Mary", "Kal").build();
        System.out.println(person3);
    }
}
