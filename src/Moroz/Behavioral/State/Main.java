package Moroz.Behavioral.State;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        Program program = new Program();
        program.setState(new State1());


        for (int i = 0; i < 10; i++) {
            program.changeState((int) (Math.random()*5+1));
            program.runState();
            System.out.println("\n++++++++++++\n");

        }

    }
}
