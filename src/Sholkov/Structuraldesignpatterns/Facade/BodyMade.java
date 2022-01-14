package Sholkov.Structuraldesignpatterns.Facade;

    public class BodyMade {
    private Body cabrio;
    private Body coupe;
    private Body limusin;

    public BodyMade() {
        cabrio = new Cabrio();
        coupe = new Coupe();
        limusin = new Limusin();
    }
    public void madeCabrio(){
        cabrio.made();
    }
    public void madeCoupe(){
        coupe.made();
    }
    public void madeLimusin(){
        limusin.made();
    }
}