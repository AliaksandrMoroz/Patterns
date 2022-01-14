package Moroz.structural.Bridge;

public class Saw extends Tool{
    public Saw(Maker maker) {
        super(maker);
    }

    @Override
    public String toString() {
        return "Saw{}"+maker;
    }
}
