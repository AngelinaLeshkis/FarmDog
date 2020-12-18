package com.farmdog.staff;

import com.farmdog.dogs.Dog;
import java.util.Map;

public class Vet extends Staff {

    public Vet(String name) {
        super(name);
    }

    public void checkHealth(Map<Integer, Dog> dogs) {
        for (int key : dogs.keySet()) {
            if (dogs.get(key).isInvalid()) {

                System.out.println(treat(dogs.get(key)));

            } else {

                System.out.println(dogs.get(key).getName() + " is absolutely healthy");

            }
        }
    }

    public String treat(Dog dog) {

        dog.setInvalid(false);
        return dog.getName() + " goes for a treatment";

    }

}
