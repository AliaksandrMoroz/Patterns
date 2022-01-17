package Moroz.Behavioral.Visitor;

public class Main {
    public static void main(String[] args) {


        Machine cx100 = new CX100();
        Machine qm = new QM();
        Machine schneiberger = new Schneiberger();

        GrindWorker alex = new AlexWorker();
        GrindWorker slava = new SlavaWorker();
        GrindWorker dmitriy = new DmitriyWorker();

        cx100.grind(alex);
        cx100.grind(slava);
        cx100.grind(dmitriy);

        System.out.println("\n++++++++++++++++++\n");

        qm.grind(alex);
        qm.grind(slava);
        qm.grind(dmitriy);

        System.out.println("\n++++++++++++++++++\n");

        schneiberger.grind(alex);
        schneiberger.grind(slava);
        schneiberger.grind(dmitriy);

    }

}
