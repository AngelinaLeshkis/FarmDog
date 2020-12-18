package com.farmdog.farm;

import com.farmdog.dogs.AdultDog;
import com.farmdog.dogs.Dog;
import com.farmdog.dogs.OldDog;
import com.farmdog.dogs.Puppy;
import com.farmdog.staff.Cleaner;
import com.farmdog.staff.Feeder;
import com.farmdog.staff.Vet;
import java.util.HashMap;
import java.util.Map;

public class Farm {

    private Map<Integer, Dog> dogs;
    private Cleaner cleaner;
    private Feeder feeder;
    private Vet vet;
    private static Farm instance;

    private Farm() {
        dogs = new HashMap<>();
        setInitialMapOfDogs();
        initializeWorkersOfFarm();
    }

    public static synchronized Farm getInstance() {

        if (instance == null) {
            instance = new Farm();
        }

        return instance;
    }

    private void setInitialMapOfDogs() {
        Dog puppy = new Puppy("Dack");
        dogs.put(puppy.getId(), puppy);
        Dog adultDog = new AdultDog("Jack");
        dogs.put(adultDog.getId(), adultDog);
        Dog oldDog = new OldDog("Rick");
        dogs.put(oldDog.getId(), oldDog);
    }

    private void initializeWorkersOfFarm() {
        cleaner = new Cleaner("Nick");
        feeder = new Feeder("Sam");
        vet = new Vet("Richard");
    }

    public void startNewDay() {
        feeder.feedingTheDog(dogs);
        vet.checkHealth(dogs);
        cleaner.cleanTheAviary(dogs);

        for (int key : dogs.keySet()) {
            dogs.get(key).startDayActivity();
        }

        feeder.feedingTheDog(dogs);
    }

    public Map<Integer, Dog> getDogs() {
        return dogs;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
