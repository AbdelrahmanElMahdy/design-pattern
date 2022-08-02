package strategy_pattern.src;

public class Atmosphere {
    public void setBird(Bird bird) {
        this.bird = bird;
    }

    private Bird bird;

    public Atmosphere(Bird bird) {
        this.bird = bird;
    }

    public void fly() {
        this.bird.fly();
    }
}
