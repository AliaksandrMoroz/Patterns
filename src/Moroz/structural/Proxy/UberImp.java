package Moroz.structural.Proxy;

public class UberImp implements Uber {
    String address;

    public UberImp(String address) {
        this.address = address;
        System.out.println("Loading uber base...");
    }

    @Override
    public void searchDriver() {
        System.out.println("Searching driver...");
        System.out.println("Your address "+ address);
    }
}
