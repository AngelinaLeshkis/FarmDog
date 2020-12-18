package com.farmdog.staff;

import com.farmdog.dogs.Dog;
import java.util.Map;

public class Cleaner extends Staff{

    public Cleaner(String name) {
        super(name);
    }

    public void cleanTheAviary(Map<Integer,Dog> dogs) {
        for (int key : dogs.keySet()) {
            System.out.println(dogs.get(key).getName() + "`s aviary has cleaned");
        }
    }
}
