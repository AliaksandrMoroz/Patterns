package Moroz.Behavioral.Visitor;

public class CX100 implements Machine{
    @Override
    public void grind(GrindWorker worker) {
        System.out.println(worker+" starting work in CX100");
        worker.work(this);
    }
}
