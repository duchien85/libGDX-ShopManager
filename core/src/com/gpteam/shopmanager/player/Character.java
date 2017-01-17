package com.gpteam.shopmanager.player;

import com.gpteam.shopmanager.player.character.Age;
import com.gpteam.shopmanager.player.character.Gender;
import com.gpteam.shopmanager.player.character.Name;
import com.gpteam.shopmanager.player.character.Stats;

/*
 * Created by masmix on 17.01.2017.
 */
public class Character {
    private String name;
    private int age;
    private Gender gender;
    private Stats stats;

    public Character(String name, int age, Gender gender, Stats stats) {
        if (name.length() > 25 || name.length() < 2)
            throw new IllegalArgumentException("name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        if (age > 120 || age < 12)
            throw new IllegalArgumentException("age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;

        this.gender = gender;
        this.stats = stats;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > 25 || name.length() < 2)
            throw new IllegalArgumentException("name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 120 || age < 12)
            throw new IllegalArgumentException("age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
    }
}
