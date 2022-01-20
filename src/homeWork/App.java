package homeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
        List<Human> humans = new ArrayList<>();
        humans.add(new Human("Bob", 15, "1", "Bobric"));
        humans.add(new Human("Mary", 17, "2", "Vochen"));
        humans.add(new Human("Steve", 25, "3", "Water"));
        humans.add(new Human("Vasya", 13, "4", "Bublic"));
        humans.add(new Human("Nil", 30, "5", "River"));

        humans.forEach(System.out::println);

        System.out.println("Вариант 1: ");
        App.collectHumanVar1(humans);

        System.out.println("Вариант 2: ");
        App.collectHumanVar2(humans);
    }

    public static void collectHumanVar1(List<Human> humans) {
        Map<String, List<String>> mapHuman = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(x -> x.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, (x) -> List.of(x.getName(), x.getSurname())));
        mapHuman.forEach((x, y) -> System.out.println("Key: " + x + " Value: " + y));
    }

    public static void collectHumanVar2(List<Human> humans) {
        Map<String, String> map = humans.stream()
                .peek(x -> x.setAge(x.getAge() + 1))
                .filter(x -> x.getAge() >= 18)
                .collect(Collectors.toMap(Human::getId, (x) -> (x.getName().concat(" " + x.getSurname()))));
        map.forEach((x, y) -> System.out.println("Key: " + x + ", Value: " + y));
    }
}
