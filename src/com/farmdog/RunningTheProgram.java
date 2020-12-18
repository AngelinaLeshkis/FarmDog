package com.farmdog;

import com.farmdog.dogs.AdultDog;
import com.farmdog.dogs.Dog;
import com.farmdog.dogs.OldDog;
import com.farmdog.dogs.Puppy;
import com.farmdog.farm.Farm;
import com.farmdog.staff.Feeder;
import java.util.HashMap;
import java.util.Map;

public class RunningTheProgram {

    public static void main(String[] args) {
        Farm farm = Farm.getInstance();
        farm.startNewDay();
        Map<Integer, Dog> dogs = new HashMap<>();
        Dog puppy = new Puppy("Dack");
        dogs.put(puppy.getId(), puppy);
        Dog adultDog = new AdultDog("Jack");
        dogs.put(adultDog.getId(), adultDog);
        Dog oldDog = new OldDog("Rick");
        dogs.put(oldDog.getId(), oldDog);
        Feeder feeder = new Feeder("Sam");
        System.out.println(feeder.feedingTheDog(puppy));
        System.out.println(feeder.feedingTheDog(adultDog));
        System.out.println(feeder.feedingTheDog(oldDog));
    }
}
