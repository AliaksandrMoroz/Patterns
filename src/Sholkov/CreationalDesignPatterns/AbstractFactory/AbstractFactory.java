package Sholkov.CreationalDesignPatterns.AbstractFactory;

public class AbstractFactory {

    public static void main(String args[]){
        new Factory(createCarFactory("с открытым"));
    }

    public static CarFactory createCarFactory(String type){
        if("с открытым".equals(type))
            return new CabrioFactory();
        else
            return new SuvFactory();
    }
}
