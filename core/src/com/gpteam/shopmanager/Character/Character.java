package com.gpteam.shopmanager.Character;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Player.Gender;
import com.gpteam.shopmanager.Skill.Skill;

/*
 * Created by masmix on 17.01.2017.
 */
public class Character {
    private String name;
    private int age;
    private Gender gender;
    private Skill skill;

    private int maxNameLength = 25;
    private int minNameLength = 2;

    private int maxAgeLength = 120;
    private int minAgeLength = 16;

    public Character(String name, int age, Gender gender, Skill skill) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        if (age > maxAgeLength || age < minAgeLength)
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;

        this.gender = gender;
        this.skill = skill;
    }

    public Character(String name, int age, Gender gender) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        if (age > maxAgeLength || age < minAgeLength)
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;

        this.gender = gender;
        // radnom skill generating
    }

    public Character(String name, int age) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        if (age > maxAgeLength || age < minAgeLength)
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;

        if (MathUtils.random(0, 1) == 0)
            gender = Gender.FEMALE;
        else
            gender = Gender.MALE;
        // radnom skill generating
    }

    public Character(String name) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        age = MathUtils.random(minAgeLength, maxAgeLength);

        if (MathUtils.random(0, 1) == 0)
            gender = Gender.FEMALE;
        else
            gender = Gender.MALE;
        // radnom skill generating
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > maxAgeLength || age < minAgeLength)
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

    public Skill getSkill() {
        return skill;
    }

    public void setSkill(Skill skill) {
        this.skill = skill;
    }
}
