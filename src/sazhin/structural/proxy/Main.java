package sazhin.structural.proxy;

public class Main {
    public static void main(String[] args) {
        RenaultProxy renaultProxy1 = new RenaultProxy("John");
        renaultProxy1.build();
        renaultProxy1.paint();

        RenaultProxy renaultProxy2 = new RenaultProxy("Dana");
        renaultProxy2.build();
        renaultProxy2.paint();
    }
}
