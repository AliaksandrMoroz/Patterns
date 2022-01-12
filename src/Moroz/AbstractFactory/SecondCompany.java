package Moroz.AbstractFactory;

public class SecondCompany {
    private Saw saw;
    private Drill drill;
    private MillingCutter millingCutter;

    public Saw getSaw() {
        return saw;
    }

    public void setSaw(Saw saw) {
        this.saw = saw;
    }

    public Drill getDrill() {
        return drill;
    }

    public void setDrill(Drill drill) {
        this.drill = drill;
    }

    public MillingCutter getMillingCutter() {
        return millingCutter;
    }

    public void setMillingCutter(MillingCutter millingCutter) {
        this.millingCutter = millingCutter;
    }




}
