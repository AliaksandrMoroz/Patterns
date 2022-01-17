package Moroz.Behavioral.State;

import Moroz.creational.Protype.MyObject;

public class State4 implements State{
    @Override
    public void run() {
        MyObject firstMyObject = new MyObject("firstName", 1000, true);

        MyObject secondMyObject = (MyObject) firstMyObject.copy();


        System.out.println("First: "+firstMyObject + "\n" + "Second: "+secondMyObject);
        System.out.println(firstMyObject==secondMyObject);
    }
}
