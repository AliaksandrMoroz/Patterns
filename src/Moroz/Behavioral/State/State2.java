package Moroz.Behavioral.State;

import sazhin.creational.abstractFactory.HeroFactory;
import sazhin.creational.abstractFactory.HulkFactory;

import static sazhin.creational.abstractFactory.Main.printHeroInfo;

public class State2 implements State{
    @Override
    public void run() {
        HeroFactory hulkFactory = new HulkFactory();
        printHeroInfo(hulkFactory);
    }
}
