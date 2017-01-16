package com.gpteam.shopmanager.misc;

/*
 * Created by masmix on 16.01.2017.
 */
public class Age {
    private int age;

    public Age(int age) {
        if (!(age < 0) || !(age > 120))
            this.age = age;
        else
            throw new IllegalArgumentException("Age is either too low or too high.");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
