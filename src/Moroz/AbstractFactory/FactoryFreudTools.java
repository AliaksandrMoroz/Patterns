package Moroz.AbstractFactory;

import Moroz.AbstractFactory.FreudTools.FreudDrill;
import Moroz.AbstractFactory.FreudTools.FreudMillingCutter;
import Moroz.AbstractFactory.FreudTools.FreudSaw;

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
