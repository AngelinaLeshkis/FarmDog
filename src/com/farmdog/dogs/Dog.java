package com.farmdog.dogs;

public class Dog {

    private static int id;
    private String name;
    private boolean hungry;
    private boolean invalid;
    private boolean trained;
    private String ration;

    public Dog(String name) {
        this.name = name;
        Dog.id++;
    }

    public int getId() {
        return Dog.id;
    }

    public void setId(int id) {
        Dog.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHungry() {
        return hungry;
    }

    public void setHungry(boolean hungry) {
        this.hungry = hungry;
    }

    public boolean isInvalid() {
        return invalid;
    }

    public void setInvalid(boolean invalid) {
        this.invalid = invalid;
    }

    public boolean isTrained() {
        return trained;
    }

    public void setTrained(boolean trained) {
        this.trained = trained;
    }

    public String getRation() {
        return ration;
    }

    public void setRation(String ration) {
        this.ration = ration;
    }

    public void startDayActivity() {
    }
}
