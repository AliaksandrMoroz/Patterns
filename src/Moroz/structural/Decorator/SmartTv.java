package Moroz.structural.Decorator;

public class SmartTv implements TV{
    TV tv;
    int price=50;

    public SmartTv(TV tv) {
        this.tv = tv;
    }

    @Override
    public int countPrice() {
        return tv.countPrice()+price;
    }
}
