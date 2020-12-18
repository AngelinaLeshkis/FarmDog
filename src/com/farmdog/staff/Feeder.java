package com.farmdog.staff;

import com.farmdog.dogs.Dog;
import java.util.Map;

public class Feeder extends Staff {

    public Feeder(String name) {
        super(name);
    }

    public void feedingTheDog(Map<Integer, Dog> dogs) {
        for (int key : dogs.keySet()) {
            System.out.println(dogs.get(key).getName() + " has eaten " + dogs.get(key).getRation());
            dogs.get(key).setHungry(false);
        }
    }

}
