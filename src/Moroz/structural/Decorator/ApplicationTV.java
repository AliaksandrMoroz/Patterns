package Moroz.structural.Decorator;

public class ApplicationTV implements TV{
    TV tv;
    int price=150;

    public ApplicationTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public int countPrice() {
        return tv.countPrice()+price;
    }
}
