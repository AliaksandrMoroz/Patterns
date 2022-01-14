package Moroz.structural.Decorator;

public class BasicTV implements TV{
    String maker;

    public BasicTV(String maker) {
        this.maker = maker;
    }


    int price=100;
    @Override
    public int countPrice() {
        System.out.println(maker);
        return price;
    }
}
