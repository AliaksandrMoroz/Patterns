package Moroz.Behavioral.TemplateMethod;



public abstract class Reader {
    void read() throws InterruptedException {
        System.out.println("Open connection...");
        Thread.sleep(1000);
        System.out.println("Open connection...");
        Thread.sleep(1000);
        System.out.println("Open connection...");
        Thread.sleep(1000);
        System.out.println("Loading text start...");
        System.out.println(readInReader());
        System.out.println("Close connection...");

    }
    abstract String readInReader();
}
