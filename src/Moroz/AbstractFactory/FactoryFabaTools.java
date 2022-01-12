package Moroz.AbstractFactory;

import Moroz.AbstractFactory.FabaTools.FabaDrill;
import Moroz.AbstractFactory.FabaTools.FabaMillingCutter;
import Moroz.AbstractFactory.FabaTools.FabaSaw;

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
