package Moroz.Behavioral.Visitor;

public interface GrindWorker {
    void work(CX100 cx100);
    void work(Schneiberger schneiberger);
    void work(QM qm);

}
