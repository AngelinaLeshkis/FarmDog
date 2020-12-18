package com.farmdog.staff;

import com.farmdog.dogs.Dog;

public class Cleaner extends Staff{

    public Cleaner(String name) {
        super(name);
    }

    public String cleanTheAviary(Dog dog) {
        return "The aviary of " + dog.getName() + " have cleaned";
    }
}
