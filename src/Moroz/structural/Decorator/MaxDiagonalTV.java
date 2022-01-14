package Moroz.structural.Decorator;

public class MaxDiagonalTV implements TV{
    TV tv;
    int price=150;

    public MaxDiagonalTV(TV tv) {
        this.tv = tv;
    }

    @Override
    public int countPrice() {
        return tv.countPrice()+price;
    }
}
