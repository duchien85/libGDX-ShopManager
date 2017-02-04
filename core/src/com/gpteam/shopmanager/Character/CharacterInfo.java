package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.Player.Sex;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;

    public CharacterInfo(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    public CharacterInfo(boolean allRandom) {

    }
}
