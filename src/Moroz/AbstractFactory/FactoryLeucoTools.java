package Moroz.AbstractFactory;

import Moroz.AbstractFactory.LeucoTools.LeucoDrill;
import Moroz.AbstractFactory.LeucoTools.LeucoMillingCutter;
import Moroz.AbstractFactory.LeucoTools.LeucoSaw;

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
