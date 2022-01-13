package sazhin.creational.abstractFactory;

public class HulkFactory implements HeroFactory {
    @Override
    public Weapon getWeapon() {
        return new Hands();
    }

    @Override
    public SuperPower getSuperPower() {
        return new Strong();
    }
}
