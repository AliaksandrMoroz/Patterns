package Moroz.creational.AbstractFactory;

import Moroz.creational.AbstractFactory.FabaTools.FabaDrill;
import Moroz.creational.AbstractFactory.FabaTools.FabaMillingCutter;
import Moroz.creational.AbstractFactory.FabaTools.FabaSaw;

public class FactoryFabaTools implements AbstractFactory{
    @Override
    public Saw addSaw() {
        return new FabaSaw();
    }

    @Override
    public Drill addDrill() {
        return new FabaDrill();
    }

    @Override
    public MillingCutter addMillingCutter() {
        return new FabaMillingCutter();
    }
}
