package Sholkov.CreationalDesignPatterns.Builder;

public enum VagGroup {
    VW, AUDI, SKODA, PORSCHE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
