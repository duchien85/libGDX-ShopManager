package com.gpteam.shopmanager.player;

import com.gpteam.shopmanager.Character.Age;
import com.gpteam.shopmanager.Character.Gender;
import com.gpteam.shopmanager.Character.Name;
import com.gpteam.shopmanager.Character.Stats;

/*
 * Created by masmix on 16.01.2017.
 */
public class Player {
    private Name name;
    private Age age;
    private Gender gender;
    private Stats stats;

    public Player(Name name, Age age, Gender gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.stats = stats;
    }

}
