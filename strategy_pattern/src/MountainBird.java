package strategy_pattern.src;

import strategy_pattern.src.Bird;

public class MountainBird implements Bird {

    @Override
    public void fly() {
        System.out.println("Mountain bird is flying now..");
    }
}
