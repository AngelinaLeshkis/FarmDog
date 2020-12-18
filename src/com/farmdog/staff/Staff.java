package com.farmdog.staff;

public class Staff {

    private static int id;
    private String name;

    public Staff(String name) {
        this.name = name;
        Staff.id++;
    }

    public static int getId() {
        return id;
    }

    public static void setId(int id) {
        Staff.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
