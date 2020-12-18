package com.farmdog.staff;

import com.farmdog.dogs.Dog;

public class Trainer extends Staff{

    public Trainer(String name) {
        super(name);
    }

    public String train(Dog dog) {
        return dog.getName() + " have completed the training";
    }
}
