package sazhin.creational.abstractFactory;

public class ThorFactory implements HeroFactory {
    @Override
    public Weapon getWeapon() {
        return new Hammer();
    }

    @Override
    public SuperPower getSuperPower() {
        return new Immortal();
    }
}


