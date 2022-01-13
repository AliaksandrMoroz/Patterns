package Sholkov.CreationalDesignPatterns.Builder;

public enum Paint {
    RED, GREEN, YELLOW, BLUE, BLACK, WHITE;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
