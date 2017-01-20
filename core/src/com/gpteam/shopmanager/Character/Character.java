package com.gpteam.shopmanager.Character;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.Text.Text;

/*
 * Created by masmix on 17.01.2017.
 */
public class Character {
    private String name;
    private int age;
    private String sex;

    private static int maxNameLength = 25;
    private static int minNameLength = 2;

    private static int maxAgeLength = 120;
    private static int minAgeLength = 16;

    public Character(String name, int age, Sex sex) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        if (age > maxAgeLength || age < minAgeLength)
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
        else
            this.age = age;

        this.setSex_(sex);
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
            sex = Text.sexMale;
        else
            sex = Text.sexFemale;
    }

    public Character(String name) {
        if (name.length() > maxNameLength || name.length() < minNameLength)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            this.name = name;

        age = MathUtils.random(minAgeLength, maxAgeLength);

        if (MathUtils.random(0, 1) == 0)
            sex = Text.sexMale;
        else
            sex = Text.sexFemale;
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

    private void setSex_(Sex sex) {
        if (sex.equals(Sex.MALE))
            this.sex = Text.sexMale;

        else if (sex.equals(Sex.FEMALE))
            this.sex = Text.sexFemale;

        else throw new IllegalArgumentException("Sex must be either male or female. Found: " + sex);
    }
}
