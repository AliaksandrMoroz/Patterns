package Moroz.structural.Proxy;

public class Main {
    public static void main(String[] args) {
    Uber uber =new UberProxy("Pobeditelei 21");
    uber.searchDriver();
    }
}
