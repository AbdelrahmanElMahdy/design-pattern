package strategy_pattern.src;

import strategy_pattern.src.Bird;

public class CityBird implements Bird {
    @Override
    public void fly() {
        System.out.println("City bird is flying now..");

    }
}
