package Moroz.creational.AbstractFactory;

import Moroz.creational.AbstractFactory.FreudTools.FreudDrill;
import Moroz.creational.AbstractFactory.FreudTools.FreudMillingCutter;
import Moroz.creational.AbstractFactory.FreudTools.FreudSaw;

public class FactoryFreudTools implements AbstractFactory{
    @Override
    public Saw addSaw() {
        return new FreudSaw();
    }

    @Override
    public Drill addDrill() {
        return new FreudDrill();
    }

    @Override
    public MillingCutter addMillingCutter() {
        return new FreudMillingCutter();
    }
}
