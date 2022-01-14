package Moroz.creational.Singleton;

public class Sing {
    private static Sing sing;
    public static Integer count=0;

    private Sing(){
        count++;
    }

    public static Sing getSing() {
        if(sing==null){
            synchronized (sing.count){
                if(sing==null){
                    sing=new Sing();
                }
            }
        }
        return sing;
    }
}
