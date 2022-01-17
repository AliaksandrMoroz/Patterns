package Moroz.Behavioral.TemplateMethod;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Reader reader1 = new DataBaseReader();
        Reader reader2 = new TextReader();

        reader1.read();

        System.out.println("\n++++++++++++++++++\n");

        reader2.read();


    }
}
