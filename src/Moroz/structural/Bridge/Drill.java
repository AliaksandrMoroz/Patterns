package Moroz.structural.Bridge;

public class Drill extends Tool{
    public Drill(Maker maker) {
        super(maker);
    }

    @Override
    public String toString() {
        return "Drill{}"+maker;
    }
}
