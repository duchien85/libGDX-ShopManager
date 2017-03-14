package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.RandomGenerator.RandGen;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;

    public CharacterInfo(String name, int age, Sex sex) {
        validateAndAssign(name, age, sex);
    }

    public CharacterInfo() {
        initialize();
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

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        if (validate(sex))
            this.sex = sex;
    }

    private void initialize() {
        RandGen randGen = new RandGen();
        name = randGen.getRandomName();
        age = randGen.getRandomAge();
        sex = randGen.getRandomSex();
    }

    private void assign(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private void validateAndAssign(String name, int age, Sex sex) {
        if (validate(name, age, sex))
            assign(name, age, sex);
        else
            throw new IllegalArgumentException("One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString());
    }

    private boolean validate(String name, int age, Sex sex) {
        if (validate(name) && validate(age) && validate(sex))
            return true;
        else
            return false;
    }

    private boolean validate(String name) {
        if (name.length() < MAX_NAME_LENGTH && name.length() > MIN_NAME_LENGTH)
            return true;
        else
            throw new IllegalArgumentException("Name must contain at least 2 characters, up to 25. Found: " + name.length());
    }

    private boolean validate(int age) {
        if (age <= MAX_AGE_LENGTH && age >= MIN_AGE_LENGTH)
            return true;
        else
            throw new IllegalArgumentException("Age must be at least 12 and no higher than 120. Found: " + age);
    }

    private boolean validate(Sex sex) {
        if (sex.equals(Sex.MALE))
            return true;

        else if (sex.equals(Sex.FEMALE))
            return true;

        else throw new IllegalArgumentException("Sex must be either male or female. Found: " + sex.toString());
    }
}
