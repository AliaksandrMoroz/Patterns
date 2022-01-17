package Moroz.Behavioral.Visitor;

public class QM implements Machine{
    @Override
    public void grind(GrindWorker worker) {
        System.out.println(worker+" starting work in QM");
        worker.work(this);
    }
}
