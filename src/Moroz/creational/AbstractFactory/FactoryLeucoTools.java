package Moroz.creational.AbstractFactory;

import Moroz.creational.AbstractFactory.LeucoTools.LeucoDrill;
import Moroz.creational.AbstractFactory.LeucoTools.LeucoMillingCutter;
import Moroz.creational.AbstractFactory.LeucoTools.LeucoSaw;

public class FactoryLeucoTools implements AbstractFactory{
    @Override
    public Saw addSaw() {
        return new LeucoSaw();
    }

    @Override
    public Drill addDrill() {
        return new LeucoDrill();
    }

    @Override
    public MillingCutter addMillingCutter() {
        return new LeucoMillingCutter();
    }
}
