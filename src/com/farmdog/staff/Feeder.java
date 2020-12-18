package com.farmdog.staff;

import com.farmdog.dogs.Dog;

public class Feeder extends Staff {

    public Feeder(String name) {
        super(name);
    }

    public String feedingTheDog(Dog dog) {
        return dog.getName() + " have eaten " + dog.getRation();
    }

}
