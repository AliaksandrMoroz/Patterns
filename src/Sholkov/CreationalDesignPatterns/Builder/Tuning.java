package Sholkov.CreationalDesignPatterns.Builder;

public enum Tuning {
    STAGE1, STAGE2, STAGE3;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
