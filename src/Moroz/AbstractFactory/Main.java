package Moroz.AbstractFactory;

public class Main {
    public static void main(String[] args) {
        System.out.println("First company need Leuco tools");
        FirstCompany firstCompany = new FirstCompany();
        AbstractFactory firstAbstractFactory= new FactoryLeucoTools();
        firstCompany.setDrill(firstAbstractFactory.addDrill());
        firstCompany.setMillingCutter(firstAbstractFactory.addMillingCutter());
        firstCompany.setSaw(firstAbstractFactory.addSaw());
        System.out.println("________________");

        System.out.println("Second company need Faba tools");
        SecondCompany secondCompany=new SecondCompany();
        AbstractFactory secondAbstractFactory = new FactoryFabaTools();
        secondCompany.setDrill(secondAbstractFactory.addDrill());
        secondCompany.setMillingCutter(secondAbstractFactory.addMillingCutter());
        secondCompany.setSaw(secondAbstractFactory.addSaw());


    }
}
