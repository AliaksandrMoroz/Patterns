package Sholkov.CreationalDesignPatterns.Builder;

public final class Auto {
    private final String name;
    private final VagGroup vagGroup;
    private final Body body;
    private final Paint paint;
    private final Tuning tuning;

    private Auto(Builder builder) {
        this.name = builder.name;
        this.vagGroup = builder.vagGroup;
        this.body = builder.body;
        this.paint = builder.paint;
        this.tuning = builder.tuning;
    }

    public String getName() {
        return name;
    }

    public VagGroup getBrand() {
        return vagGroup;
    }

    public Body getBody() {
        return body;
    }

    public Paint getColor() {
        return paint;
    }

    public Tuning getTuning() {
        return tuning;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand=" + vagGroup +
                ", body=" + body +
                ", color=" + paint +
                ", tuning=" + tuning +
                '}';
    }

    public static class Builder {

        private final String name;
        private final VagGroup vagGroup;
        private Body body;
        private Paint paint;
        private Tuning tuning;

        public Builder(VagGroup vagGroup, String name) {
            if (vagGroup == null || name == null) {
                throw new IllegalArgumentException("There is no such machine");
            }
            this.name = name;
            this.vagGroup = vagGroup;
        }

        public Builder withPaint(Paint paint) {
            this.paint = paint;
            return this;
        }

        public Builder withBody(Body body) {
            this.body = body;
            return this;
        }

        public Builder withTuning(Tuning tuning) {
            this.tuning = tuning;
            return this;
        }

        public Auto build() {
            return new Auto(this);
        }
    }
}
