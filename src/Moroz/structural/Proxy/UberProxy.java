package Moroz.structural.Proxy;

public class UberProxy implements Uber{
    String address;
    UberImp uber;

    public UberProxy(String address) {
        this.address = address;
    }

    @Override
    public void searchDriver() {
        if(uber==null){
            uber=new UberImp(address);
            uber.searchDriver();
        }
    }
}
