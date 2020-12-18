package com.farmdog.farm;

import com.farmdog.dogs.Dog;
import com.farmdog.staff.Cleaner;
import com.farmdog.staff.Trainer;
import com.farmdog.staff.Vet;
import java.util.Map;

public class Farm {

    private Map<Integer ,Dog> dogs;
    private Cleaner cleaner;
    private Trainer trainer;
    private Vet vet;
    public static Farm instance;

    private Farm() {

    }

    public static synchronized Farm getInstance() {

        if (instance == null) {
            instance = new Farm();
        }

        return instance;
    }

    public void startNewDay() {


    }

    public Map<Integer, Dog> getDogs() {
        return dogs;
    }

    public void setDogs(Map<Integer, Dog> dogs) {
        this.dogs = dogs;
    }

    public Cleaner getCleaner() {
        return cleaner;
    }

    public void setCleaner(Cleaner cleaner) {
        this.cleaner = cleaner;
    }

    public Trainer getTrainer() {
        return trainer;
    }

    public void setTrainer(Trainer trainer) {
        this.trainer = trainer;
    }

    public Vet getVet() {
        return vet;
    }

    public void setVet(Vet vet) {
        this.vet = vet;
    }
}
