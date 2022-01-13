package sazhin.structural.proxy;

public class RenaultProxy implements Car{

    private String userName;
    private Renault renault;

    public RenaultProxy(String userName) {
        super();
        this.userName = userName;
        renault = new Renault();
    }

    public void build(){
        renault.build();
    }

    public void paint(){
        if (userName == "John") {
            System.out.println("A Renault car CANNOT be painted by John !");
        } else {
            renault.paint();
        }
    }

}
