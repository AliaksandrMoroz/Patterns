package Moroz.Behavioral.Visitor;

public class Schneiberger implements Machine{
    @Override
    public void grind(GrindWorker worker) {
        System.out.println(worker+" starting work in Schneiberger");
        worker.work(this);
    }
}
