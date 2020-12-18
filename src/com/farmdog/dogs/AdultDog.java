package com.farmdog.dogs;

public class AdultDog extends Dog {

    public AdultDog(String name) {
        super(name);
        super.setTrained(true);
    }

    @Override
    public String getRation() {
        return "the ration for adult dogs";
    }
}
