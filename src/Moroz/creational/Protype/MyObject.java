package Moroz.creational.Protype;

public class MyObject implements Copyable{

    private String name;
    private int price;
    private boolean aBoolean;

    public MyObject(String name, int price, boolean aBoolean) {
        this.name = name;
        this.price = price;
        this.aBoolean = aBoolean;
    }

    @Override
    public Object copy() {
        MyObject copy = new MyObject(this.name,this.price,this.aBoolean);
        return copy;
    }

    @Override
    public String toString() {
        return "MyObject{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", aBoolean=" + aBoolean +
                '}';
    }
}
