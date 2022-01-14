package Moroz.structural.Decorator;

public class Main {
    public static void main(String[] args) {

        TV newTv = new ApplicationTV(new BasicTV("Samsung"));
        System.out.println(newTv.countPrice());
        newTv = new SmartTv(new MaxDiagonalTV(new ApplicationTV(new BasicTV("Sony"))));
        System.out.println(newTv.countPrice());
    }
}
