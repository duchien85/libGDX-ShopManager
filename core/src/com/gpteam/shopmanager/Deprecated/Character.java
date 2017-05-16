package com.gpteam.shopmanager.Deprecated;

import com.badlogic.gdx.math.MathUtils;
import com.gpteam.shopmanager.Player.Sex;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 17.01.2017.
 */
public class Character {
    private String name;
    private int age;
    private Sex sex;

    public Character(String name, int age, Sex sex) {
        if (validate(name, age, sex)) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        } else throw new IllegalArgumentException("One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString());
    }

    public Character(String name, int age) {
        if (validate(name, age)) {
            this.name = name;
            this.age = age;
            if (MathUtils.random(0, 1) == 0)
                sex = Sex.MALE;
            else
                sex = Sex.FEMALE;
        }
    }

    public Character(String name) {
        if (validate(name))
            this.name = name;

        age = MathUtils.random(MIN_AGE_LENGTH, MAX_AGE_LENGTH);

        if (MathUtils.random(0, 1) == 0)
            sex = Sex.MALE;
        else
            sex = Sex.FEMALE;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validate(name))
            this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validate(age))
            this.age = age;
    }

    private void setSex(Sex sex) {
        if (validate(sex))
            this.sex = sex;
    }

    private boolean validate(String name, int age) {
        if (validate(name) && validate(age))
            return true;
        else
            return false;
    }

    private boolean validate(String name, int age, Sex sex) {
        if (validate(name) && validate(age) && validate(sex))
            return true;
        else
            return false;
    }

    private boolean validate(String name) {
        if (name.length() > MAX_NAME_LENGTH || name.length() < MIN_NAME_LENGTH)
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
        else
            return true;
    }

    private boolean validate(int age) {
        if (age > MAX_AGE_LENGTH || age < MIN_AGE_LENGTH)
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
        else
            return true;
    }

    private boolean validate(Sex sex) {
        if (sex.equals(Sex.MALE))
            return true;

        else if (sex.equals(Sex.FEMALE))
            return true;

        else throw new IllegalArgumentException("Sex must be either male or female. Found: " + sex.toString());
    }
}
