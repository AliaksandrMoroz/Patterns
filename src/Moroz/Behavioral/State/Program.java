package Moroz.Behavioral.State;

public class Program {
    State state;

    public Program() {
        changeState((int) (Math.random()*5+1));
    }

    public void setState(State state) {
        this.state = state;
    }

    void changeState(int change) {
        switch (change) {
            case 1:
                System.out.println("Creating State:1");
                state = new State1();
                break;
            case 2:
                System.out.println("Creating State:2");
                state = new State2();
                break;
            case 3:
                System.out.println("Creating State:3");
                state = new State3();
                break;
            case 4:
                System.out.println("Creating State:4");
                state = new State4();
                break;
        }

    }

    void runState() {
        state.run();
    }
}
