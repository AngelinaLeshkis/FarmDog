package com.farmdog.dogs;

public class OldDog extends Dog {

    public OldDog(String name) {
        super(name);
        super.setTrained(true);
    }

    @Override
    public String getRation() {
        return "the ration for old dogs";
    }

    @Override
    public void startDayActivity() {
        System.out.println(getName() + " goes to the aviary");
    }
}
