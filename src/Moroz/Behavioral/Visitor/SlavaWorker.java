package Moroz.Behavioral.Visitor;

public class SlavaWorker implements GrindWorker{
    String name = "Slava";

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                '}';
    }

    @Override
    public void work(CX100 cx100) {
        System.out.println("Grind saw...");
    }

    @Override
    public void work(Schneiberger schneiberger) {
        System.out.println("Read instruction for Schneiberger");
    }

    @Override
    public void work(QM qm) {
        System.out.println("Read instruction for QM");
    }
}
