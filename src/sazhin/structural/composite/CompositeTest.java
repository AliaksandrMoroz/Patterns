package sazhin.structural.composite;

public class CompositeTest {
    public static void main(String[] args) {
        Car sportCar = new SportCar();
        Car basicCar = new BasicCar();
        Drawing drawing = new Drawing();
        drawing.add(sportCar);
        drawing.add(basicCar);
        drawing.draw("green");
        drawing.clear();
        drawing.add(sportCar);
        drawing.add(basicCar);
        drawing.draw("white");
    }
}
