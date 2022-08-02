package strategy_pattern.src;

import strategy_pattern.src.Atmosphere;
import strategy_pattern.src.CityBird;
import strategy_pattern.src.MountainBird;

public class StrategyPattern {
    public static void main(String[] args) {
        // so first we have city bird is flying
        Atmosphere atmosphere = new Atmosphere(new CityBird());
        atmosphere.fly();

        // now we change the bird type during the run time
        atmosphere.setBird(new MountainBird());
        atmosphere.fly();

    }
}

