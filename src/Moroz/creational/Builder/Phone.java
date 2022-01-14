package Moroz.creational.Builder;

public class Phone {
    private String maker;
    private String model;
    private String memory;
    private int price;

    @Override
    public String toString() {
        return "Phone{" +
                "maker='" + maker + '\'' +
                ", model='" + model + '\'' +
                ", memory='" + memory + '\'' +
                ", price=" + price +
                '}';
    }

    public void setMaker(String maker) {
        this.maker = maker;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
