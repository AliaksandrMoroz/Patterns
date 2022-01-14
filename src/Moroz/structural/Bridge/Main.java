package Moroz.structural.Bridge;

public class Main {
    public static void main(String[] args) {
        Tool saw = new Saw(new Freud());
        Tool drill = new Drill(new Leuco());
        System.out.println(saw+"\n"+drill);
    }
}
