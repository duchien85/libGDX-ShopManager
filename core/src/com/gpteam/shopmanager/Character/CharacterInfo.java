package com.gpteam.shopmanager.Character;

import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorHandler;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorListener;
import com.gpteam.shopmanager.Engine.Modules.ErrorHandler.ErrorType;
import com.gpteam.shopmanager.Player.Sex;
import com.gpteam.shopmanager.RandomGenerator.RandGen;
import com.gpteam.shopmanager.Engine.Modules.Text.Text;

import static com.gpteam.shopmanager.Variables.Variables.*;

/*
 * Created by masmix on 04.02.2017.
 */
public class CharacterInfo {
    private String name;
    private int age;
    private Sex sex;

    public CharacterInfo(String name, int age, Sex sex) {
        if (validate(name, age, sex))
            assign(name, age, sex);
        else {
            ErrorListener.notify(ErrorType.INVALID_CHAR_INFO);
            ErrorHandler.handleIllegalArgumentException("One of the arguments was invalid. Found: name: " + name + ", age: " + age + ", sex: " + sex.toString());
        }
    }

    public CharacterInfo() {
        initialize();
    }

    @Override
    public String toString() {
        return "name: " + name + ", age: " + age + ", sex: " + sex.toString();
    }

    public void setCharacterInfo(String name, int age, Sex sex) {
            if (validate(name, age, sex))
                assign(name, age, sex);
            else
                ErrorHandler.handleIllegalArgumentException("");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (validate(name))
            this.name = name;
        else {
            ErrorListener.notify(ErrorType.INVALID_NAME);
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_NAME);
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (validate(age))
            this.age = age;
        else {
            ErrorListener.notify(ErrorType.INVALID_AGE);
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_AGE);
        }
    }

    public Sex getSex() {
        return sex;
    }

    public void setSex(Sex sex) {
        if (validate(sex))
            this.sex = sex;
        else {
            ErrorListener.notify(ErrorType.INVALID_SEX);
            ErrorHandler.handleIllegalArgumentException(Text.ERROR_SET_SEX);
        }
    }

    private void initialize() {
        name = RandGen.getRandomName();
        age = RandGen.getRandomAge();
        sex = RandGen.getRandomSex();
    }

    private void assign(String name, int age, Sex sex) {
        this.name = name;
        this.age = age;
        this.sex = sex;
    }

    private boolean validate(String name, int age, Sex sex) {
        return validate(name) && validate(age) && validate(sex);
    }

    private boolean validate(String name) {
        return name.length() <= MAX_NAME_LENGTH && name.length() >= MIN_NAME_LENGTH;
    }

    private boolean validate(int age) {
        return age <= MAX_AGE_LENGTH && age >= MIN_AGE_LENGTH;
    }

    private boolean validate(Sex sex) {
        return sex.equals(Sex.MALE) || sex.equals(Sex.FEMALE);
    }
}
