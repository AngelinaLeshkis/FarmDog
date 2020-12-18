package com.farmdog.dogs;

public class Puppy extends Dog {

    public Puppy(String name) {
        super(name);
    }

    @Override
    public String getRation() {
        return "the ration for puppies";
    }

    @Override
    public void startDayActivity() {
        System.out.println(getName() + " goes to the training");
        setTrained(true);
    }
}
