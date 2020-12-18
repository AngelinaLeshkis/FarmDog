package com.farmdog.staff;

import com.farmdog.dogs.Dog;

public class Vet extends Staff {

    public Vet(String name) {
        super(name);
    }

    public String checkHealth(Dog dog) {
        if (dog.isInvalid()) {
            return treat(dog);
        }

        return dog.getName() + " is absolutely healthy";
    }

    public String treat(Dog dog) {
        dog.setInvalid(false);
        return dog.getName() + " goes for a treatment";
    }

}
