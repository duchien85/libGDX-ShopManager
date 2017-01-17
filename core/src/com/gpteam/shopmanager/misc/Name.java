package com.gpteam.shopmanager.misc;

/*
 * Created by masmix on 16.01.2017.
 */
public class Name {
    private String name;

    public Name(String name) {
        if (!(name.length() == 0) || !(name.length() > 25))
            this.name = name;
        else
            throw new IllegalArgumentException("name is either empty or too long.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
