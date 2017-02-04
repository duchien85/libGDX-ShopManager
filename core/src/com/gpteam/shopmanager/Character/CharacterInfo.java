package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.RandomGenerator.RandomGenerator;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;
    private RandomGenerator randomGenerator;

    public CharacterInfo(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public CharacterInfo(boolean allRandom) {
        if (allRandom) {
            randomGenerator = new RandomGenerator();
            randomGenerator.generateRandomInfo();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        this.sex = sex;
    }
}
