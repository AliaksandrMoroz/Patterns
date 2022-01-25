package Sholkov.CreationalDesignPatterns.Singleton;

public class Randoming {

    private static Randoming randoming;
    private static int choice;

    public static synchronized Randoming getRandoming() {
        if (randoming == null){
            randoming = new Randoming();
        }
        return randoming;
    }

    private Randoming(){}

    public void addChoiceInfo (String choiceInfo){
        choice=choice*3/2+1;

        // (Math.random()*7)

    }

    public void showChoice(){
        System.out.println(choice);
    }


}
