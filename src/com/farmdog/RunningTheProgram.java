package com.farmdog;

import com.farmdog.dogs.Dog;
import com.farmdog.dogs.Puppy;
import com.farmdog.farm.Farm;
import java.util.Map;

public class RunningTheProgram {

    public static void main(String[] args) {
        Farm farm = Farm.getInstance();
        Map<Integer, Dog> dogs = farm.getDogs();
        Dog puppy = new Puppy("Luck");
        dogs.put(puppy.getId(), puppy);
        dogs.get(4).setInvalid(true);
        farm.startNewDay();
    }
}
