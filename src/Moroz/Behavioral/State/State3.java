package Moroz.Behavioral.State;

import Moroz.creational.Builder.Director;
import Moroz.creational.Builder.Phone;
import Moroz.creational.Builder.SamsungGalaxyBuilder;

public class State3 implements State{
    @Override
    public void run() {
        Phone phone = new Director(new SamsungGalaxyBuilder()).getPhone();
        System.out.println(phone);
    }
}
